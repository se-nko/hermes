package ru.senko.hermes.user.api.client.impl;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import ru.senko.hermes.model.algoritm.Algoritms;
import ru.senko.hermes.service.HermesService;
import ru.senko.hermes.user.api.client.UserClient;

import java.util.Set;

@ShellComponent
@RequiredArgsConstructor
public class ShellClient implements UserClient {

    private final HermesService hermesService;

    @ShellMethod("Create new account")
    public String createAccount(@ShellOption("name") String name) {
        hermesService.addAccount(name);
        return String.format("Account with name: %s was created", name);
    }

    @ShellMethod("Get account's balance")
    public String getBalance(@ShellOption("name") String name) {
        return hermesService.getAccount(name).getBalance().toString();
    }

    @ShellMethod("Get account's strategies")
    public Set<Algoritms> getStrategies(@ShellOption("name") String name) {
        return hermesService.getAccount(name).getStrategies().keySet();
    }

    @ShellMethod("Start strategy")
    public String startStrategy(@ShellOption("name") String name,
                                @ShellOption("strat") String key) {
        val algorithm = Algoritms.valueOf(key.toUpperCase());
        val account = hermesService.getAccount(name);
        if (account.isAlgoritmRunning(algorithm)) {
            return key + "has already started!";
        }
        account.startAlgoritm(algorithm);
        return key + " started!";
    }

    @ShellMethod("Stop strategy")
    public String stopStrategy(@ShellOption("name") String name,
                               @ShellOption("strat") String key) {
        val algorithm = Algoritms.valueOf(key.toUpperCase());
        val account = hermesService.getAccount(name);
        if (account.isAlgoritmRunning(algorithm)) {
            account.stopAlgoritm(algorithm);
            return key + " was stopped!";
        }
        return key + " is not started!";
    }

}
