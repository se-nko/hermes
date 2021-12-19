package ru.senko.hermes.model.algoritm.impl;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import ru.senko.hermes.market.api.client.binance.TradeEventListener;
import ru.senko.hermes.model.algoritm.Algorithm;
import ru.senko.hermes.web.dto.AccountSettingDTO;

import java.util.concurrent.*;

@Slf4j
public class Scalping extends Algorithm {

    private static final int SIGNALS_COUNT = 2;
    private final CyclicBarrier barrier;
    private boolean isContinue = true;

    @Builder
    public Scalping(TradeEventListener publisher, AccountSettingDTO setting) {
        this.publisher = publisher;
        this.setting = setting;
        this.barrier = new CyclicBarrier(SIGNALS_COUNT);
    }

    @Override
    public void run() {

    }

    @Override
    protected void start() {

    }

    @Override
    protected void stop() {

    }

//    @Override
//    public void start() throws Exception {
//        ExecutorService signalExecService = Executors.newFixedThreadPool(SIGNALS_COUNT);
//        List<FutureTask<?>> signals = List.of(
//                new FutureTask<>(new TestSignal(5, TimeUnit.SECONDS, barrier), null),
//                new FutureTask<>(new TestSignal(10, TimeUnit.SECONDS, barrier), null)
//        );
//        signals.forEach(signalExecService::submit);
//        while (isContinue) {
//            // logic of algoritm
//            log.info("Awaiting all signals...");
//            barrier.await();
//            log.info("All signals are fired!");
//            // contunie after condition logic
//            barrier.reset();
//        }
//        signals.forEach(s -> s.cancel(true));
//        signalExecService.shutdown();
//    }
//
//    @Override
//    public void stop() {
//        isContinue = false;
//    }

}
