package ru.senko.hermes.user.api.client;

import ru.senko.hermes.model.algoritm.Algoritms;

import java.util.Set;

public interface UserClient {

    String createAccount(String name);

    String getBalance(String name);

    Set<Algoritms> getStrategies(String name);

    String startStrategy(String name, String key);

    String stopStrategy(String name, String key);

}
