package ru.senko.hermes.model.signal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public abstract class Signal {

    @Getter @Setter
    private int actualTime;
    protected SignalsObserver observer;

    public Signal(int actualTime) {
        this.actualTime = actualTime;
    }

    public void fire() {
        observer.trigger(this);
    }

    void setListener(SignalsObserver observer) {
        this.observer = observer;
    }

}
