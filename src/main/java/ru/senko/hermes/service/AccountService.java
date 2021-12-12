package ru.senko.hermes.service;

import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.domain.account.AssetBalance;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.val;
import org.springframework.stereotype.Service;
import ru.senko.hermes.db.repository.AccountRepository;
import ru.senko.hermes.web.dto.AccountDTO;

import static ru.senko.hermes.utils.MapperUtil.dto;
import static ru.senko.hermes.utils.MapperUtil.entity;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;
    private final BinanceApiRestClient binanceClient;

    @SneakyThrows
    public AccountDTO create(AccountDTO accountDTO) {
        val account = accountRepository.save(entity(accountDTO));
        return dto(account);
    }

}
