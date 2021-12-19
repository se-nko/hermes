package ru.senko.hermes.model.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import ru.senko.hermes.model.algoritm.Algorithm;
import ru.senko.hermes.model.algoritm.impl.Scalping;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

import static ru.senko.hermes.model.algoritm.Algorithm.SCALPING;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Account {

    String name;
    Crypto balance;
    Map<String, FutureTask<?>> strategies;
    Set<String> runningStrategies;
    ExecutorService executorService;

    public Account(String name) {
        this.name = name;
        balance = new Crypto();
        strategies = new HashMap<>();
        runningStrategies = new HashSet<>();
        executorService = Executors.newSingleThreadExecutor();
    }

//    public void startAlgoritm(String algoritm) {
//        FutureTask<?> task = getStrategyTask(algoritm);
//        strategies.put(algoritm, task);
//        executorService.submit(task);
//        runningStrategies.add(algoritm);
//    }

    public void stopAlgoritm(String algoritm) {
        strategies.get(algoritm).cancel(true);
        runningStrategies.remove(algoritm);
    }

    public boolean isAlgoritmRunning(String algoritm) {
        return runningStrategies.contains(algoritm);
    }

//    private FutureTask<?> getStrategyTask(String algoritm) {
//        Algorithm task = null;
//        switch (algoritm) {
//            case SCALPING:
//                task = new Scalping(); break;
//        }
//        return new FutureTask<>(new Strategy(new CryptoPair(), task));
//    }

}
