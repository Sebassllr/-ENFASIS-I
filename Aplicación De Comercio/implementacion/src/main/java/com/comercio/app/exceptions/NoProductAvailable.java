package com.comercio.app.exceptions;

public class NoProductAvailable extends RuntimeException {

    public NoProductAvailable(String message) {
        super(message);
    }
}
