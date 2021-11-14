package ru.senko.hermes.market.api.client.binance.model;

@FunctionalInterface
public interface Publisher<T> {

    T publish();

}
