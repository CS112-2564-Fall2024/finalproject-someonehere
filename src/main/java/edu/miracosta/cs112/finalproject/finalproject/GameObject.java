package edu.miracosta.cs112.finalproject.finalproject;

import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class GameObject {
    Shape shape;
    double layoutX, layoutY;

    static double cameraX = 0;
    static double cameraY = 0;
    public static void setCameraX(double X) { cameraX = X; }
    public static void setCameraY(double Y) { cameraY = Y; }
    public static double getCameraX() { return cameraX; }
    public static double getCameraY() { return cameraY; }

    public GameObject(Rectangle rect) {
        this.shape = rect;
        this.layoutX = this.shape.getLayoutX();
        this.layoutY = this.shape.getLayoutY();
    }

    public GameObject(Polygon poly) {
        this.shape = poly;
        this.layoutX = this.shape.getLayoutX();
        this.layoutY = this.shape.getLayoutY();
    }

    // tells if colliding or not
    public boolean intersects(GameObject gameObject) {
        if (this == gameObject) {
            return false;
        }

        return (shape.getBoundsInParent().intersects(gameObject.shape.getBoundsInParent()));
    }

    public void update() {
        this.shape.setLayoutX(this.layoutX - GameObject.this.getCameraX());
        this.shape.setLayoutY(this.layoutY - GameObject.this.getCameraY());
    }
}
