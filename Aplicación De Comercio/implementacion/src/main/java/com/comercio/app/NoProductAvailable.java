package com.comercio.app;

public class NoProductAvailable extends RuntimeException {

    public NoProductAvailable(String message) {
        super(message);
    }
}
