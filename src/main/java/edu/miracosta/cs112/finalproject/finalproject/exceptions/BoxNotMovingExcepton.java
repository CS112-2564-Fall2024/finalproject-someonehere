package edu.miracosta.cs112.finalproject.finalproject.exceptions;

public class BoxNotMovingExcepton extends Exception {
    public BoxNotMovingExcepton() {
        super("Error004: Player is not moving!");
    }

    public BoxNotMovingExcepton(String message) {
        super(message);
    }

    public BoxNotMovingExcepton(Throwable cause) {
        super(cause);
    }

    public BoxNotMovingExcepton(String message, Throwable cause) {
        super(message, cause);
    }

    public BoxNotMovingExcepton(String message, Throwable cause, boolean enableSuppression, boolean writable) {
        super(message, cause, enableSuppression, writable);
    }
}
