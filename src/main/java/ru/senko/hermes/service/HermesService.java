package ru.senko.hermes.service;

import org.springframework.stereotype.Service;
import ru.senko.hermes.model.domain.Account;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class HermesService {

    private Map<String, Account> accounts = new ConcurrentHashMap<>();

    public void addAccount(String name) {
        accounts.put(name, new Account(name));
    }

    public Account getAccount(String name) {
        return accounts.get(name);
    }

}
