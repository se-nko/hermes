package ru.senko.hermes.exceptions;

public class CurrencyNotFound extends RuntimeException {
    public CurrencyNotFound() {
        super();
    }

    public CurrencyNotFound(String message) {
        super(message);
    }

    public CurrencyNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public CurrencyNotFound(Throwable cause) {
        super(cause);
    }

    protected CurrencyNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
