package ru.senko.hermes.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.senko.hermes.service.HermesService;

import javax.websocket.server.PathParam;
import java.util.Set;

@Slf4j
@RestController
@RequestMapping("/tg")
@RequiredArgsConstructor
public class TelegramController {

    private final HermesService hermes;


    @GetMapping("/acc/balance")
    public String getBalance() {
        return hermes.getBalance();
    }

    @GetMapping("/acc/strategies")
    public Set<String> getStrategies() {
        return hermes.getStrategies();
    }

    @GetMapping("/acc/strategies/start")
    public String startStrategy(@PathParam("name") String name) {
        return hermes.startStrategy(name);
    }

    @GetMapping("/acc/strategies/stop")
    public String stopStrategy(@PathParam("name") String name) {
        return hermes.stopStrategy(name);
    }

}
