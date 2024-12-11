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
    /**
     * Setting Camera's X position
     *
     * @param X
     */
    public static void setCameraX(double X) { cameraX = X; }
    /**
     * Setting Camera's Y position
     *
     * @param Y
     */
    public static void setCameraY(double Y) { cameraY = Y; }
    /**
     * Getting Camera's X position
     *
     * @return cameraX
     */
    public static double getCameraX() { return cameraX; }
    /**
     * Getting Camera's Y position
     *
     * @return cameraY
     */
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
     *
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

abstract class Character {
    private int movePixels;
    private int dash;
    protected int HP;

    /**
     * Create a Character from a subclass */
    protected Character() {
    }

    /** GETTERS
     *
     * @return how much that character moves
     */
    public int getMove () {
        return this.movePixels;
    }

    /**
     *
     * @return character using dash
     */
    public int getDash () {
        return this.dash;
    }

    /**
     *
     * @return character's HP
     */
    public int getHP () {
        return this.HP;
    }


    /** SETTERS
     *
     * @param movePixels
     */
    public void setMove (int movePixels) {
        this.movePixels = movePixels;
    }

    /**
     *
     * @param movePixels
     */
    public void setDash (int movePixels) {
        this.dash = movePixels * 2;
    }

    /**
     *
     * @param HP
     */
    public void setHP (int HP) {
        if (HP >= 0)
            this.HP = HP;
    }
}