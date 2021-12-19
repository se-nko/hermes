package ru.senko.hermes.market.api.client.binance;

import com.binance.api.client.BinanceApiWebSocketClient;
import com.binance.api.client.domain.event.AggTradeEvent;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.senko.hermes.market.api.client.binance.model.Subscriber;

import java.io.Closeable;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Optional.ofNullable;

@Slf4j
@Component
@AllArgsConstructor
public class TradeEventListener {

    private final BinanceApiWebSocketClient client;
    private final Map<String, Closeable> websockets = new ConcurrentHashMap<>();
    private final Map<String, List<Subscriber<AggTradeEvent>> /*TODO make thread-safe list*/> subscribers = new ConcurrentHashMap<>();

    public void subscribe(String currency, Subscriber<AggTradeEvent> subscriber) {
        subscribers.merge(currency, List.of(subscriber),
                (a, b) -> Stream.of(a, b)
                        .flatMap(Collection::stream)
                        .collect(Collectors.toList()));

        websockets.computeIfAbsent(currency, websocket -> client.onAggTradeEvent(currency,
                (event) -> ofNullable(subscribers.get(currency))
                        .ifPresent(list -> list.forEach(s -> {
                            s.notify(event);
                        }))));
    }

    //TODO make thread-safe
    public void unSubscribe(String currency, Subscriber<AggTradeEvent> subscriber) {
        ofNullable(subscribers.get(currency)).ifPresent(list -> list.remove(subscriber));
    }

}
