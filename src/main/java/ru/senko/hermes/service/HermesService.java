package ru.senko.hermes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.senko.hermes.market.api.client.binance.job.TickersPublisher;
import ru.senko.hermes.model.algoritm.Algoritm;
import ru.senko.hermes.model.algoritm.impl.Averaging;
import ru.senko.hermes.model.domain.Account;

import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static ru.senko.hermes.market.api.client.binance.model.Currency.BTC_USDT;

@Service
public class HermesService {

    private Map<String, Account> accounts = new ConcurrentHashMap<>();
    private Algoritm algoritm;

    @Autowired
    public HermesService(TickersPublisher publisher) {
        algoritm = new Averaging(BTC_USDT, publisher, ChronoUnit.SECONDS, 60,3, 0.5, 0.156);
        try {
            algoritm.start();
        } catch (Exception e) {}
    }

    public void addAccount(String name) {
        accounts.put(name, new Account(name));
    }

    public Account getAccount(String name) {
        return accounts.get(name);
    }

}
