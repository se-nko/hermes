package ru.senko.hermes.web.controller;

import com.binance.api.client.domain.account.AssetBalance;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.senko.hermes.model.domain.Currency;
import ru.senko.hermes.service.AccountService;
import ru.senko.hermes.service.HermesService;
import ru.senko.hermes.web.dto.AccountDTO;
import ru.senko.hermes.web.dto.AccountSettingDTO;

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

    @PostMapping("/account/{id}/settings/create")
    public ResponseEntity<?> createAccountSettings(@PathVariable Long id,
                                                   @RequestBody AccountSettingDTO dto) {
        try {
            return ResponseEntity.ok(accountService.createSetting(id, dto));
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        }
        return errorWithStatus(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PostMapping("/account/{id}/settings/edit")
    public ResponseEntity<?> editAccountSettings(@PathVariable String id,
                                                 @RequestBody AccountSettingDTO dto) {
        try {
            return ResponseEntity.ok(accountService.editSetting(dto));
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        }
        return errorWithStatus(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @DeleteMapping("/account/settings/{setting-id}/delete")
    public ResponseEntity<?> deleteAccountSettings(@PathVariable(name = "setting-id") Long settingId) {
        try {
            accountService.deleteSetting(settingId);
            return ResponseEntity.ok().build();
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

    @GetMapping("/account/{id}/{strategy}/{currency}/start")
    public void startStrategy(@PathVariable Long id,
                              @PathVariable String strategy,
                              @PathVariable String currency) {
        try {
            hermesService.runStrategy(accountService.getAccount(id), strategy, Currency.valueOf(currency));
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        }
    }

    @GetMapping("/account/{id}/{strategy}/stop")
    public void stopStrategy(@PathVariable Long id, @PathVariable String strategy) {
        try {
            hermesService.stopStrategy(accountService.getAccount(id), strategy);
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        }
    }

}
