package ru.senko.hermes.market.api.client.binance.model;

@FunctionalInterface
public interface Subscriber<T> {

    void notify(T value);

}
