package ru.senko.hermes.service;

import org.springframework.stereotype.Service;
import ru.senko.hermes.model.algoritm.Algoritms;
import ru.senko.hermes.model.base.Account;

import javax.annotation.PostConstruct;
import java.util.Set;

@Service
public class HermesService {

    private Account account;

    @PostConstruct
    public void postConstruct() {
        account = new Account();
    }

    public String getBalance() {
        return account.getBalance().toString();
    }

    public Set<Algoritms> getStrategies() {
        return account.getStrategies().keySet();
    }

    public String startStrategy(String key) {
        Algoritms algoritm = Algoritms.valueOf(key.toUpperCase());
        if (account.isAlgoritmRunning(algoritm)) {
            return key + "has already started!";
        }
        account.startAlgoritm(algoritm);
        return key + " started!";
    }

    public String stopStrategy(String key) {
        Algoritms algoritm = Algoritms.valueOf(key.toUpperCase());
        if (account.isAlgoritmRunning(algoritm)) {
            account.stopAlgoritm(algoritm);
            return key + " was stopped!";
        }
        return key + " is not started!";
    }

}
