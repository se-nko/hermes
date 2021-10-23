package ru.senko.hermes.binance.job;

import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.domain.market.TickerPrice;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@EnableScheduling
@AllArgsConstructor
public class TickersJob {

    private final BinanceApiRestClient restClient;

//    @Scheduled(fixedRate = 60000)
    private void call() {
        List<TickerPrice> tickerPrices = restClient.getAllPrices();
        tickerPrices.forEach(tickerPrice -> {
            try {
                log.info("CODE: {} | PRICE: {}", tickerPrice.getSymbol(), tickerPrice.getPrice());
            } catch (Exception e) {
                log.error(e.getMessage(), e);
            }
        });
    }

}
