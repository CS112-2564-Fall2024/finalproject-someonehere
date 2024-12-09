package edu.miracosta.cs112.finalproject.finalproject.exceptions;

public class ObstaclesNotMovingExcepton extends Exception {
    public ObstaclesNotMovingExcepton() {
        super("Error003: Obstacle is not moving!");
    }

    public ObstaclesNotMovingExcepton(String message) {
        super(message);
    }

    public ObstaclesNotMovingExcepton(Throwable cause) {
        super(cause);
    }

    public ObstaclesNotMovingExcepton(String message, Throwable cause) {
        super(message, cause);
    }

    public ObstaclesNotMovingExcepton(String message, Throwable cause, boolean enableSuppression, boolean writable) {
        super(message, cause, enableSuppression, writable);
    }
}
