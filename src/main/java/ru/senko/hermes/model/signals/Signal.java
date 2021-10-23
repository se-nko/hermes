package ru.senko.hermes.model.signals;

import lombok.NoArgsConstructor;

import java.util.concurrent.TimeUnit;

@NoArgsConstructor
public abstract class Signal {

    protected int actualTime;
    protected TimeUnit timeUnit;

    public Signal(int actualTime, TimeUnit timeUnit) {
        this.actualTime = actualTime;
        this.timeUnit = timeUnit;
    }

}
