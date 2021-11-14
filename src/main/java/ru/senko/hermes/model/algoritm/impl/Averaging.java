package ru.senko.hermes.model.algoritm.impl;

import com.binance.api.client.domain.market.TickerPrice;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import ru.senko.hermes.market.api.client.binance.job.TickersPublisher;
import ru.senko.hermes.market.api.client.binance.model.Currency;
import ru.senko.hermes.market.api.client.binance.model.Subscriber;
import ru.senko.hermes.model.algoritm.Algoritm;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import static java.lang.String.format;

@Slf4j
public class Averaging implements Algoritm {

    private double STOP_LOSS_PERCENT;
    private double PRICE_DIFFERENCE;
    private int DEALS_COUNT;
    private TickersPublisher publisher;
    private Currency currency;
    private double lastDealPrice;
    private double firstDealPrice;
    private int currentDealsCount;
    private Instant lastDealTime;
    private ChronoUnit chronoUnit;
    private long maxDealTime;

    public Averaging(Currency currency, TickersPublisher publisher, ChronoUnit chronoUnit,
                     long maxDealTime, int dealsCount, double stopLossPercent, double priceDifference) {
        this.publisher = publisher;
        this.currency = currency;
        this.chronoUnit = chronoUnit;
        this.maxDealTime = maxDealTime;
        this.DEALS_COUNT = dealsCount;
        this.STOP_LOSS_PERCENT = stopLossPercent;
        this.PRICE_DIFFERENCE = priceDifference;
    }

    @Override
    public void start() throws Exception {
        publisher.subscribe(currency, subscriber);
    }

    @Override
    public void stop() {
        publisher.unSubscribe(currency, subscriber);
    }

    private Subscriber<TickerPrice> subscriber = value -> {
        val price = Double.parseDouble(value.getPrice()) * 1000;
        System.out.println("Current price = " + price);
        if (currentDealsCount < DEALS_COUNT) {
            if (isGoodPriceForBuy(price)) {
                currentDealsCount++;
                if (1 == currentDealsCount) {
                    firstDealPrice = price;
                }
                lastDealPrice = price;
                lastDealTime = Instant.now();
                log.info(format("[DEAL-BUY] deal: %d/%d price: %s", currentDealsCount, DEALS_COUNT, lastDealPrice));
            }
        } else if (DEALS_COUNT == currentDealsCount && price >= firstDealPrice) {
            resetParameters();
            log.info(format("[DEAL-SELL] price: %s", price));
        } else if (price <= firstDealPrice - (firstDealPrice * STOP_LOSS_PERCENT)) {
            resetParameters();
            log.info(format("[DEAL-STOP-LOSS] price: %s", lastDealPrice));
        } else if (lastDealTime != null && chronoUnit.between(Instant.now(), lastDealTime) >= maxDealTime) {
            resetParameters();
            lastDealTime = null;
            log.info(format("[DEAL-TIMEOUT-SELL] price: %s", price));
        }
    };

    private boolean isGoodPriceForBuy(double price) {
        return 0 == lastDealPrice
                || (lastDealPrice != price && PRICE_DIFFERENCE > Math.abs((lastDealPrice - price)/lastDealPrice*100));
    }

    private void resetParameters() {
        lastDealPrice = 0;
        firstDealPrice = 0;
        currentDealsCount = 0;
    }

}
