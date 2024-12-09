package edu.miracosta.cs112.finalproject.finalproject;

import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class GameObject {
    /**
     * Object and object bounds positions variables
     */
    Shape shape;
    double layoutX, layoutY;

    /**
     * Camera variables
     */
    static double cameraX = 0;
    static double cameraY = 0;
    public static void setCameraX(double X) { cameraX = X; }
    public static void setCameraY(double Y) { cameraY = Y; }
    public static double getCameraX() { return cameraX; }
    public static double getCameraY() { return cameraY; }

    /**
     * GameObjects if they are a rectangle
     *
     * @param rect
     */
    public GameObject(Rectangle rect) {
        this.shape = rect;
        this.layoutX = this.shape.getLayoutX();
        this.layoutY = this.shape.getLayoutY();
    }

    /**
     * GameObjects if they are a poly
     * @param poly
     */
    public GameObject(Polygon poly) {
        this.shape = poly;
        this.layoutX = this.shape.getLayoutX();
        this.layoutY = this.shape.getLayoutY();
    }

    /**
     * Tells if an GameObject is colliding with another
     *
     * @param gameObject
     * @return The boundaries of the object in a rectangle
     */
    public boolean intersects(GameObject gameObject) {
        if (this == gameObject || getClass() == null) return false;
        return this.shape.getBoundsInParent().intersects(gameObject.shape.getBoundsInParent());
    }

    /**
     * Updates the camera and objects
     */
    public void update() {
        this.shape.setLayoutX(this.layoutX - GameObject.this.getCameraX());
        this.shape.setLayoutY(this.layoutY - GameObject.this.getCameraY());
    }
}
