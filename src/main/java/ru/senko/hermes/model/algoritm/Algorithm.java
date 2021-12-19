package ru.senko.hermes.model.algoritm;

import ru.senko.hermes.market.api.client.binance.TradeEventListener;
import ru.senko.hermes.web.dto.AccountSettingDTO;

public abstract class Algorithm implements Runnable {

    public static final String SCALPING = "scalping";
    public static final String AVERAGING  = "averaging";

    protected AccountSettingDTO setting;
    protected TradeEventListener publisher;

    protected abstract void start();

    protected abstract void stop();

}
