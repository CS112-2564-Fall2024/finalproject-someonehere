package edu.miracosta.cs112.finalproject.finalproject.exceptions;

public class CameraNotMovingExcepton extends Exception {
    public CameraNotMovingExcepton() {
        super("Error001: Camera is not moving!");
    }

    public CameraNotMovingExcepton(String message) {
        super(message);
    }

    public CameraNotMovingExcepton(Throwable cause) {
        super(cause);
    }

    public CameraNotMovingExcepton(String message, Throwable cause) {
        super(message, cause);
    }

    public CameraNotMovingExcepton(String message, Throwable cause, boolean enableSuppression, boolean writable) {
        super(message, cause, enableSuppression, writable);
    }
}
