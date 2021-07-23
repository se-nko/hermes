package ru.senko.hermes.model.base;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.FutureTask;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Account {

    Crypto balance;
    Map<String, FutureTask<?>> strategies;

    public Account() {
        balance = new Crypto();
        strategies = new HashMap<>();
    }

}
