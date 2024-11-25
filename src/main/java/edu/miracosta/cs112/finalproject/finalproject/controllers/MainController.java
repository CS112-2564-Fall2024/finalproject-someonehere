package edu.miracosta.cs112.finalproject.finalproject.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class MainController {
    @FXML
    private Label labelInstructions;
    @FXML
    private Label textSave;
    @FXML
    private ImageView imageSave;
    @FXML
    private Rectangle ground1;
    @FXML
    private Rectangle playerRect;
    @FXML
    private Rectangle box1;
    @FXML
    private Rectangle box2;
    @FXML
    private Rectangle box3;
    @FXML
    private Rectangle box4;
    @FXML
    private Rectangle box5;
    @FXML
    private Polygon spike1;
    @FXML
    private Polygon spike2;

    protected void handleKeyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        switch (keyCode) {
            case KeyEvent.VK_UP:

                break;
            case KeyEvent.VK_DOWN:

                break;
            case KeyEvent.VK_LEFT:

                break;
            case KeyEvent.VK_RIGHT:

                break;
        }
    }
}