package ru.senko.hermes.exceptions;

public class AccountSettingNotFound extends RuntimeException {
    public AccountSettingNotFound() {
        super();
    }

    public AccountSettingNotFound(String message) {
        super(message);
    }

    public AccountSettingNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountSettingNotFound(Throwable cause) {
        super(cause);
    }

    protected AccountSettingNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
