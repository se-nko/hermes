package ru.senko.hermes.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.senko.hermes.service.HermesService;

@Slf4j
@RestController
@RequestMapping("/tg")
@RequiredArgsConstructor
public class TelegramController {

    private HermesService hermes;


    @GetMapping("/account/start")
    public void startAccount() {
        log.info("account was created");
    }

}
