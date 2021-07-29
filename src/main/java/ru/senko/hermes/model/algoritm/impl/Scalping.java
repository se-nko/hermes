package ru.senko.hermes.model.algoritm.impl;

import lombok.extern.slf4j.Slf4j;
import ru.senko.hermes.model.algoritm.Algoritm;
import ru.senko.hermes.model.signal.impl.TestSignal;
import java.util.List;
import java.util.concurrent.*;

@Slf4j
public class Scalping implements Algoritm {

    private static final int SIGNALS_COUNT = 2;
    private final CyclicBarrier barrier;
    private boolean isContinue = true;

    public Scalping() {
        barrier = new CyclicBarrier(SIGNALS_COUNT);
    }

    @Override
    public void start() throws Exception {
        ExecutorService signalExecService = Executors.newFixedThreadPool(SIGNALS_COUNT);
        List<FutureTask<?>> signals = List.of(
                new FutureTask<>(new TestSignal(5, TimeUnit.SECONDS, barrier), null),
                new FutureTask<>(new TestSignal(10, TimeUnit.SECONDS, barrier), null)
        );
        signals.forEach(signalExecService::submit);
        while (isContinue) {
            // logic of algoritm
            log.info("Awaiting all signals...");
            barrier.await();
            log.info("All signals are fired!");
            // contunie after condition logic
            barrier.reset();
        }
        signals.forEach(s -> s.cancel(true));
        signalExecService.shutdown();
    }

    @Override
    public void stop() {
        isContinue = false;
    }

}
