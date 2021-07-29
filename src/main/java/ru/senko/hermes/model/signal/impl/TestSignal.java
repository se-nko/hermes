package ru.senko.hermes.model.signal.impl;

import lombok.extern.slf4j.Slf4j;
import ru.senko.hermes.model.signal.Signal;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Slf4j
public class TestSignal extends Signal implements Runnable {

    private CyclicBarrier barrier;

    public TestSignal(int actualTime, TimeUnit timeUnit, CyclicBarrier barrier) {
        super(actualTime, timeUnit);
        this.barrier = barrier;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);
                barrier.await(actualTime, timeUnit);
            } catch (InterruptedException
                    | BrokenBarrierException
                    | TimeoutException ex) {
                log.error(ex.toString(), ex);
                break;
            }
        }
    }

}

