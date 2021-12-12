package ru.senko.hermes.web.controller;

import com.binance.api.client.domain.account.AssetBalance;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("account/balance/{code}")
    public ResponseEntity<String> getBalance(@PathVariable String code) {
        return ResponseEntity.ok(accountService.getBalance(code));
    }

    @GetMapping("account/balances")
    public ResponseEntity<List<AssetBalance>> getBalances() {
        return ResponseEntity.ok(accountService.getBalances());
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
