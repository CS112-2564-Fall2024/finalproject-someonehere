package edu.miracosta.cs112.finalproject.finalproject.exceptions;

public class PlayerNotMovingExcepton extends Exception {
    public PlayerNotMovingExcepton() {
        super("Error002: Player cannot not moving!");
    }

    public PlayerNotMovingExcepton(String message) {
        super(message);
    }

    public PlayerNotMovingExcepton(Throwable cause) {
        super(cause);
    }

    public PlayerNotMovingExcepton(String message, Throwable cause) {
        super(message, cause);
    }

    public PlayerNotMovingExcepton(String message, Throwable cause, boolean enableSuppression, boolean writable) {
        super(message, cause, enableSuppression, writable);
    }
}
