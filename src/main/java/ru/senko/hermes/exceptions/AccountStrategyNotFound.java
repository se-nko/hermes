package ru.senko.hermes.exceptions;

public class AccountStrategyNotFound extends RuntimeException {
    public AccountStrategyNotFound() {
        super();
    }

    public AccountStrategyNotFound(String message) {
        super(message);
    }

    public AccountStrategyNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountStrategyNotFound(Throwable cause) {
        super(cause);
    }

    protected AccountStrategyNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
