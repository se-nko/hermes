package ru.senko.hermes.service;

import org.springframework.stereotype.Service;
import ru.senko.hermes.model.base.Account;
import ru.senko.hermes.model.base.CryptoPair;
import ru.senko.hermes.model.base.Strategy;

import javax.annotation.PostConstruct;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

@Service
public class HermesService {

    private Account account;
    private ExecutorService executorService;

    @PostConstruct
    public void postConstruct() {
        account = new Account();
        executorService = Executors.newSingleThreadExecutor();
    }

    public String getBalance() {
        return account.getBalance().toString();
    }

    public Set<String> getStrategies() {
        return account.getStrategies().keySet();
    }

    public String startStrategy(String key) {
        if (account.getStrategies().containsKey(key)) {
            return key + "has already started!";
        }
        FutureTask<?> task = new FutureTask<>(new Strategy(new CryptoPair(), () -> { }));
        executorService.submit(task);
        account.getStrategies().put(key, task);
        return key + " started!";
    }

    public String stopStrategy(String key) {
        if (account.getStrategies().containsKey(key)) {
            account.getStrategies().get(key).cancel(true);
            account.getStrategies().remove(key);
            return key + " was stopped!";
        }
        return key + " is not started!";
    }

}
