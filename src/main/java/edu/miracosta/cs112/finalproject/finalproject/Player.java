package edu.miracosta.cs112.finalproject.finalproject;

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


        for (GameObject object : objects) {
            boolean collides = this.intersects(object);
        }
    }

    // Moving Speed
//    public void moveLeft() {
//        deltaX = -1;
//    }
//    public void moveRight() {
//        deltaX = 1;
//    }
    public void jump() {
        deltaY = -5;
    }

    public void update() {
//        deltaX += 0.1;
        deltaY += 0.1;
//        double oldX = this.layoutX;
        double oldY = this.layoutY;
//        this.layoutX += deltaX;
        this.layoutY += deltaY;
//        this.shape.setLayoutX(layoutX);
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
