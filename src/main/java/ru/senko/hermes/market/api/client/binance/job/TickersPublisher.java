package ru.senko.hermes.market.api.client.binance.job;

import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.domain.market.TickerPrice;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.senko.hermes.market.api.client.binance.model.Currency;
import ru.senko.hermes.market.api.client.binance.model.Subscriber;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
@Component
@EnableScheduling
@AllArgsConstructor
public class TickersPublisher {

    private final BinanceApiRestClient restClient;
    private final Map<Currency, TickerPrice> tickers = new HashMap<>();
    private final Map<Currency, List<Subscriber<TickerPrice>>> subscribers = new HashMap<>();

    public void subscribe(Currency currency, Subscriber<TickerPrice> subscriber) {
        subscribers.merge(currency, List.of(subscriber),
                (a, b) -> Stream.of(a, b).flatMap(Collection::stream).collect(Collectors.toList()));
    }

    public void unSubscribe(Currency currency, Subscriber<TickerPrice> subscriber) {
        Optional.ofNullable(subscribers.get(currency))
                .ifPresent(list -> list.remove(subscriber));
    }

    @Scheduled(cron = "${cron.binance.tickers}")
    private void call() {
        log.info("START TO UPDATE TICKERS");
        restClient.getAllPrices().forEach(ticker -> {
            try {
                Currency.getBySymbol(ticker.getSymbol()).ifPresent(currency -> {
                    if (tickers.put(currency, ticker) != null) {
                        Optional.ofNullable(subscribers.get(currency))
                                .ifPresent(list -> list.forEach(subscriber -> subscriber.notify(ticker)));
                    }
                });
            } catch (Exception e) {
                log.error(e.getMessage(), e);
            }
        });
    }

}
