package edu.miracosta.cs112.finalproject.finalproject.controllers;

import edu.miracosta.cs112.finalproject.finalproject.GameObject;
import edu.miracosta.cs112.finalproject.finalproject.Player;
import javafx.animation.AnimationTimer;
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
    private Rectangle ground2;
    @FXML
    private Rectangle ground3;
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
    private Rectangle box6;
    @FXML
    private Rectangle box7;
    @FXML
    private Rectangle boxMove1;
    @FXML
    private Rectangle boxFinish1;
    @FXML
    private Rectangle boxFinish2;
    @FXML
    private Rectangle boxFinish3;
    @FXML
    private Rectangle boxFinish4;
    @FXML
    private Rectangle boxFinish5;
    @FXML
    private Rectangle boxFinish6;
    @FXML
    private Rectangle boxFinish7;
    @FXML
    private Rectangle boxFinish8;
    @FXML
    private Polygon spike1;
    @FXML
    private Polygon spike2;
    @FXML
    private Rectangle rectPlayer;
    private Player player;

    ArrayList<GameObject> objectList = new ArrayList<>();

    @FXML
    private void initialize() {
        objectList.add(new GameObject(ground1));
        objectList.add(new GameObject(ground2));
        objectList.add(new GameObject(ground3));

        player = new Player(rectPlayer);
        objectList.add(player);

        AnimationTimer timer = (l) -> {
            for (GameObject o : objectList)
                o.update();
        };
        timer.start();
    }

    protected void handleKeyPressed(KeyEvent e) {
        switch (e.getCode()) {
            case LEFT -> player.moveLeft();
            case RIGHT -> player.moveRight();
            case SPACE -> player.jump();
        }
    }
}