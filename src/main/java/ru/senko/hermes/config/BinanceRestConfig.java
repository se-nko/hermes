package ru.senko.hermes.config;

import com.binance.api.client.BinanceApiAsyncRestClient;
import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.BinanceApiWebSocketClient;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.senko.hermes.market.api.client.binance.settings.BinanceSettings;

@Configuration
@AllArgsConstructor
public class BinanceRestConfig {

    private final BinanceSettings settings;

    @Bean
    public BinanceApiRestClient binanceApiRestClient() {
        return BinanceApiClientFactory
                .newInstance(settings.getApiKey(), settings.getSecretKey())
                .newRestClient();
    }

    @Bean
    public BinanceApiAsyncRestClient binanceApiAsyncRestClient() {
        return BinanceApiClientFactory
                .newInstance(settings.getApiKey(), settings.getSecretKey())
                .newAsyncRestClient();
    }

    @Bean
    BinanceApiWebSocketClient defaultApiWebSocketClient() {
        return BinanceApiClientFactory
                .newInstance(settings.getApiKey(), settings.getSecretKey())
                .newWebSocketClient();
    }

}
