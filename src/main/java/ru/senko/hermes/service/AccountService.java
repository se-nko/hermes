package ru.senko.hermes.service;

import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.domain.account.AssetBalance;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.val;
import org.springframework.stereotype.Service;
import ru.senko.hermes.db.entity.Account;
import ru.senko.hermes.db.entity.AccountSetting;
import ru.senko.hermes.db.repository.AccountRepository;
import ru.senko.hermes.db.repository.AccountSettingRepository;
import ru.senko.hermes.exceptions.AccountNotFound;
import ru.senko.hermes.exceptions.AccountSettingNotFound;
import ru.senko.hermes.exceptions.CurrencyNotFound;
import ru.senko.hermes.web.dto.AccountDTO;
import ru.senko.hermes.web.dto.AccountSettingDTO;

import java.util.List;

import static java.lang.String.format;
import static ru.senko.hermes.utils.MapperUtil.dto;
import static ru.senko.hermes.utils.MapperUtil.entity;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;
    private final AccountSettingRepository accountSettingRepository;
    private final BinanceApiRestClient binanceClient;

    @SneakyThrows
    public AccountDTO create(AccountDTO accountDTO) {
        val account = accountRepository.save(entity(Account.class, accountDTO));
        return dto(AccountDTO.class, account);
    }

    @SneakyThrows
    public AccountDTO getAccount(Long id) {
        return dto(AccountDTO.class, accountRepository.findById(id).orElseThrow(AccountNotFound::new));
    }

    public String getBalance(String code) {
        return binanceClient.getAccount().getBalances().stream()
                .filter(v -> code.equalsIgnoreCase(v.getAsset()))
                .findAny()
                .map(AssetBalance::getFree)
                .orElseThrow(() -> new CurrencyNotFound(format("The currency %s not found", code)));
    }

    public List<AssetBalance> getBalances() {
        return binanceClient.getAccount().getBalances();
    }

    @SneakyThrows
    public AccountSettingDTO createSetting(Long accountId, AccountSettingDTO accountSettingDTO) {
        val setting = entity(AccountSetting.class, accountSettingDTO);
        setting.setAccount(accountRepository.findById(accountId).orElseThrow(AccountNotFound::new));
        return dto(AccountSettingDTO.class, accountSettingRepository.save(setting));
    }

    @SneakyThrows
    public AccountSettingDTO editSetting(AccountSettingDTO accountSettingDTO) {
        val accountSetting = accountSettingRepository.findById(accountSettingDTO.getId())
                .orElseThrow(AccountSettingNotFound::new);

        accountSetting.setStrategyName(accountSettingDTO.getStrategyName());
        accountSetting.setCurrency(accountSettingDTO.getCurrency());
        accountSetting.setDealsCount(accountSettingDTO.getDealsCount());
        accountSetting.setMaxDealTime(accountSettingDTO.getMaxDealTime());
        accountSetting.setStopLossPercent(accountSettingDTO.getStopLossPercent());
        accountSetting.setPriceDifference(accountSettingDTO.getPriceDifference());
        accountSetting.setStrategyName(accountSettingDTO.getStrategyName());

        accountSettingRepository.save(accountSetting);
        return dto(AccountSettingDTO.class, accountSetting);
    }

    @SneakyThrows
    public void deleteSetting(Long settingId) {
        accountSettingRepository.deleteById(settingId);
    }

}
