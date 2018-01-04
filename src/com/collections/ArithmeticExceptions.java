package com.collections;

public class ArithmeticExceptions extends Throwable {
    public ArithmeticExceptions() {
    }

    public ArithmeticExceptions(String message) {
        super(message);
    }

    public ArithmeticExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public ArithmeticExceptions(Throwable cause) {
        super(cause);
    }

    public ArithmeticExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
