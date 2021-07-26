package ru.senko.hermes.model.signal.impl;

import lombok.extern.slf4j.Slf4j;
import ru.senko.hermes.model.signal.Signal;

@Slf4j
public class TestSignal extends Signal implements Runnable {

    public TestSignal(int actualTime) {
        super(actualTime);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            fire();
        } catch (InterruptedException ex) {
            log.error(ex.toString(), ex);
        }
    }

}

