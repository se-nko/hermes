package ru.senko.hermes.config;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.senko.hermes.binance.settings.BinanceSettings;

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

}
