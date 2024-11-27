package edu.miracosta.cs112.finalproject.finalproject.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

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
    @FXML
    private Rectangle playerRect;
    //private Player player;

   // ArrayList<GameObject> objectList = new ArrayList<>();

    @FXML


    protected void handleKeyPressed(KeyEvent e) {
        switch (e.getCode()) {
            case UP:

                break;
            case DOWN:

                break;
            case LEFT:

                break;
            case RIGHT:

                break;
            case SPACE: //player.jump();
                break;
            default:

        }
    }
}