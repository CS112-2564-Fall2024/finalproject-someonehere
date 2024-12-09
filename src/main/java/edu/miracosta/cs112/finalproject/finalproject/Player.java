package edu.miracosta.cs112.finalproject.finalproject;

import edu.miracosta.cs112.finalproject.finalproject.controllers.MainController;
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
    public void tryMove(ArrayList<GameObject> objects) {
        // todo: move logic
        // Maybe have already did it.


        for (GameObject object : objects) {
            boolean collides = this.intersects(object);
        }
    }

    // Moving Speed
    public void moveLeft() {
        deltaX = -2;
    }
    public void moveRight() {
        deltaX = 1;
    }
    public void jump() {
        if (Math.abs(deltaY) <= 0.2) {
            deltaY = -5;
        }
    }

    public void update() {
        deltaX += 0.0;
        deltaY += 0.1;

        for (GameObject object : objectList) {
            if (this.intersects(object)) {
                deltaX = -MainController.CAMERA_X_DELTA;
            }
        }

//        double oldX = this.layoutX;
        double oldY = this.layoutY;
        this.layoutX += deltaX;
        this.layoutY += deltaY;
        this.shape.setLayoutX(layoutX);
        this.shape.setLayoutY(layoutY);

        for (GameObject object : objectList) {
            if (this.intersects(object)) {
//                this.layoutX = oldX;
                this.layoutY = oldY;
//                deltaX = 0;
                deltaY = 0;
//                this.shape.setLayoutX(layoutX);
                this.shape.setLayoutY(layoutY);
            }
        }
    }


}
