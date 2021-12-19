package ru.senko.hermes.exceptions;

public class StrategyNotFound extends RuntimeException {
    public StrategyNotFound() {
        super();
    }

    public StrategyNotFound(String message) {
        super(message);
    }

    public StrategyNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public StrategyNotFound(Throwable cause) {
        super(cause);
    }

    protected StrategyNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
