package ru.senko.hermes.model.algoritm.impl;

import com.binance.api.client.domain.event.AggTradeEvent;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import ru.senko.hermes.market.api.client.binance.TradeEventListener;
import ru.senko.hermes.market.api.client.binance.model.Subscriber;
import ru.senko.hermes.model.algoritm.Algorithm;
import ru.senko.hermes.web.dto.AccountSettingDTO;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import static java.lang.String.format;

@Slf4j
public class Averaging extends Algorithm {

    private double lastDealPrice;
    private double firstDealPrice;
    private int currentDealsCount;
    private Instant lastDealTime;

    private double capital = 1000D;
    private double profit = 0D;

    @Builder
    public Averaging(TradeEventListener publisher, AccountSettingDTO setting) {
        this.setting = setting;
        this.publisher = publisher;
    }


    @Override
    public void run() {
        try {
            start();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            stop();
        }
    }

    @Override
    public void start() {
        publisher.subscribe(setting.getCurrency().name(), subscriber);
    }

    @Override
    public void stop() {
        publisher.unSubscribe(setting.getCurrency().name(), subscriber);
    }

    private final Subscriber<AggTradeEvent> subscriber = value -> {
        val price = Double.parseDouble(value.getPrice());
        val dealsCount = setting.getDealsCount();
        System.out.println("Current price = " + price);
        if (currentDealsCount < dealsCount) {
            if (isGoodPriceForBuy(price)) {
                currentDealsCount++;
                if (1 == currentDealsCount) {
                    firstDealPrice = price;
                }
                lastDealPrice = price;
                lastDealTime = Instant.now();
                capital -= price; // TODO check 0
                log.info(format("[DEAL-BUY] deal: %d/%d price: %s", currentDealsCount, dealsCount, lastDealPrice));
            }
        } else if (dealsCount == currentDealsCount && price >= firstDealPrice) {
            profit += price - firstDealPrice * dealsCount; // firstDealPrice * DEALS_COUNT // TODO check 0
            resetParameters();
            log.info(format("[DEAL-SELL] price: %s", price));
        } else if (price <= firstDealPrice - (firstDealPrice * setting.getStopLossPercent())) {
            resetParameters();
            log.info(format("[DEAL-STOP-LOSS] price: %s", lastDealPrice));
        } else if (lastDealTime != null && ChronoUnit.MILLIS.between(Instant.now(), lastDealTime) >= setting.getMaxDealTime()) {
            resetParameters();
            lastDealTime = null;
            log.info(format("[DEAL-TIMEOUT-SELL] price: %s", price));
        }
    };

    private boolean isGoodPriceForBuy(double price) {
        return 0 == lastDealPrice
                || (lastDealPrice != price && setting.getPriceDifference() > Math.abs((lastDealPrice - price)/lastDealPrice*100));
    }

    private void resetParameters() {
        lastDealPrice = 0;
        firstDealPrice = 0;
        currentDealsCount = 0;
    }

}
