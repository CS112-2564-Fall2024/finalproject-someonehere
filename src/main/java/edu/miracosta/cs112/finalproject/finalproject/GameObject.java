package edu.miracosta.cs112.finalproject.finalproject;

import javafx.scene.shape.Rectangle;

public class GameObject {
    Rectangle rectPlayer;

    // tells if colliding or not
    public boolean intersects(GameObject gameObject) {
        if (this == gameObject) {
            return false;
        }

        return (rectPlayer.getBoundsInParent().intersects(gameObject.rectPlayer.getBoundsInParent()));
    }
}
