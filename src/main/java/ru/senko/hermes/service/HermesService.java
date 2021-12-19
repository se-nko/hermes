package ru.senko.hermes.service;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.val;
import org.springframework.stereotype.Service;
import ru.senko.hermes.exceptions.AccountStrategyNotFound;
import ru.senko.hermes.exceptions.StrategyNotFound;
import ru.senko.hermes.market.api.client.binance.TradeEventListener;
import ru.senko.hermes.model.algoritm.Algorithm;
import ru.senko.hermes.model.algoritm.impl.Averaging;
import ru.senko.hermes.model.algoritm.impl.Scalping;
import ru.senko.hermes.model.domain.Currency;
import ru.senko.hermes.web.dto.AccountDTO;
import ru.senko.hermes.web.dto.AccountSettingDTO;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.String.format;
import static ru.senko.hermes.model.algoritm.Algorithm.AVERAGING;
import static ru.senko.hermes.model.algoritm.Algorithm.SCALPING;

@Service
@RequiredArgsConstructor
public class HermesService {

    private static final ExecutorService EXECUTOR_SERVICE = Executors.newCachedThreadPool(); // TODO think about ForkJoinPool.commonPool();

    private final TradeEventListener tradeEventListener;

    @SneakyThrows
    public void runStrategy(AccountDTO account, String strategy, Currency currency) {
        val setting = account.getSettings().stream()
                .filter(s -> strategy.equals(s.getStrategyName()) && currency.equals(s.getCurrency()))
                .findAny()
                .orElseThrow(AccountStrategyNotFound::new);

        EXECUTOR_SERVICE.execute(getStrategy(strategy, setting));
    }

    public void stopStrategy(AccountDTO account, String strategy) {

    }

    private Algorithm getStrategy(String strategy, AccountSettingDTO setting) {
        switch (strategy) {
            case AVERAGING:
                return Averaging.builder()
                    .setting(setting)
                    .publisher(tradeEventListener)
                    .build();
            case SCALPING:
                return Scalping.builder()
                        .setting(setting)
                        .publisher(tradeEventListener)
                        .build();
            default:
                throw new StrategyNotFound(format("Strategy %s not found", strategy));
        }
    }

}
