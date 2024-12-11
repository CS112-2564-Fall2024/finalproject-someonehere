package edu.miracosta.cs112.finalproject.finalproject;

import edu.miracosta.cs112.finalproject.finalproject.controllers.MainController;
import edu.miracosta.cs112.finalproject.finalproject.exceptions.PlayerNotMovingExcepton;
import javafx.scene.shape.Rectangle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Player extends GameObject {
    double deltaX = 0;
    double deltaY = 0;

    private ArrayList<GameObject> objectList = null;
    public void setObjectList(ArrayList<GameObject> objectList) {
        this.objectList = objectList;
    }

    public Player(Rectangle shape) {
        super(shape);
    }

    /**
     * Checks for collision with another GameObject
     */
    public void tryMove(ArrayList<GameObject> objects) {
        // todo: move logic
        // Maybe have already did it in main controller.

        for (GameObject object : objects) {
            boolean collides = this.intersects(object);
        }
    }

    /**
     * Moving Speed
     */
    public void moveLeft() {
        deltaX = -2;
    }
    public void moveRight() {
        deltaX = 1;
    }
    /** Error, after if statement around deltaY = -5;
     * Player doesn't stop moving and gets stuck
     * more against objects
     */
    public void jump() {
        if (Math.abs(deltaY) <= 0.2) {
            deltaY = -5;
        }
    }

//    public void checkException() throws PlayerNotMovingExcepton {
//        try {
//            if (this.deltaX == 0 && this.deltaY == 0) {
//                throw new PlayerNotMovingExcepton();
//            }
//        } catch (PlayerNotMovingExcepton e) {
//            System.out.println(e);
//            System.out.println("Error002: Requires Player to jump to start moving");
//        }
//    }

    public void update() {
//        this.checkException();

        deltaX += 0.0;
        deltaY += 0.1;

        /**
         * Registers if Player collides with another GameObject
         */
        for (GameObject object : objectList) {
            if (this.intersects(object)) {
                deltaX = -MainController.CAMERA_X_DELTA;
            }
        }

        /**
         * Allows Player to move
         */
        double oldX = this.layoutX;
        double oldY = this.layoutY;
        this.layoutX += deltaX;
        this.layoutY += deltaY;
        this.shape.setLayoutX(layoutX);
        this.shape.setLayoutY(layoutY);

        /**
         * Stops Player from getting stuck on the Y axis when colliding
         */
        for (GameObject object : objectList) {
            if (this.intersects(object)) {
                this.layoutY = oldY;
                deltaY = 0;
                this.shape.setLayoutY(layoutY);
            }
        }
        /**
         * Stops Player from getting stuck on the X axis when colliding
         */
        for (GameObject object : objectList) {
            if (this.intersects(object)) {
                this.layoutX = oldX;
                deltaX = 0;
                this.shape.setLayoutX(layoutX);
            }
        }
    }
}
