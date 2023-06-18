package com.example.calculatortest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ArithmeticZeroException extends Exception {
    public ArithmeticZeroException() {
    }

    public ArithmeticZeroException(String message) {
        super(message);
    }

    public ArithmeticZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArithmeticZeroException(Throwable cause) {
        super(cause);
    }

    public ArithmeticZeroException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
