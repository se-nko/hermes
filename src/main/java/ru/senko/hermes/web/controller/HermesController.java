package ru.senko.hermes.web.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.senko.hermes.service.AccountService;
import ru.senko.hermes.service.HermesService;
import ru.senko.hermes.web.dto.AccountDTO;

import java.util.Collections;
import java.util.List;

import static ru.senko.hermes.utils.ResponseFactory.errorWithStatus;

@Slf4j
@RestController
@RequiredArgsConstructor
public class HermesController {

    private final AccountService accountService;
    private final HermesService hermesService;

    @PostMapping("/account/create")
    public ResponseEntity<?> createAccount(@RequestBody AccountDTO dto) {
        try {
            return ResponseEntity.ok(accountService.create(dto).getId());
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        }
        return errorWithStatus(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("account/{id}/balance")
    public ResponseEntity<String> getBalance(@PathVariable Long id) {
        return ResponseEntity.ok("");
    }

    @GetMapping("/strategies")
    public ResponseEntity<List<String>> getStrategies() {
        return ResponseEntity.ok(Collections.emptyList());
    }

    @GetMapping("/account/{id}/{strategy}/start")
    public void startStrategy(@PathVariable String id, @PathVariable String strategy) {
    }

    @GetMapping("/account/{id}/{strategy}/stop")
    public void stopStrategy(@PathVariable String id, @PathVariable String strategy) {
    }

}
