package ru.senko.hermes.model.base;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import ru.senko.hermes.model.algoritm.Algoritm;
import ru.senko.hermes.model.algoritm.Algoritms;
import ru.senko.hermes.model.algoritm.impl.Scalping;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Account {

    Crypto balance;
    Map<Algoritms, FutureTask<?>> strategies;
    Set<Algoritms> runningStrategies;
    ExecutorService executorService;

    public Account() {
        balance = new Crypto();
        strategies = new HashMap<>();
        runningStrategies = new HashSet<>();
        executorService = Executors.newSingleThreadExecutor();
    }

    public void startAlgoritm(Algoritms algoritm) {
        FutureTask<?> task = getStrategyTask(algoritm);
        strategies.put(algoritm, task);
        executorService.submit(task);
        runningStrategies.add(algoritm);
    }

    public void stopAlgoritm(Algoritms algoritm) {
        strategies.get(algoritm).cancel(true);
        runningStrategies.remove(algoritm);
    }

    public boolean isAlgoritmRunning(Algoritms algoritm) {
        return runningStrategies.contains(algoritm);
    }

    private FutureTask<?> getStrategyTask(Algoritms algoritm) {
        Algoritm task = null;
        switch (algoritm) {
            case SCALPING:
                task = new Scalping(); break;
        }
        return new FutureTask<>(new Strategy(new CryptoPair(), task));
    }

}
