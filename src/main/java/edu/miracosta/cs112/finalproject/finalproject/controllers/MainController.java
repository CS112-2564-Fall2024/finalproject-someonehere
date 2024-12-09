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
    private Polygon spike3;
    @FXML
    private Polygon spike4;
    @FXML
    private Polygon spike5;
    @FXML
    private Polygon spike6;
    @FXML
    private Polygon spike7;
    @FXML
    private Polygon spikeMove1;
    @FXML
    private Polygon spikeMove2;
    @FXML
    private Rectangle rectPlayer;
    private Player player;

    ArrayList<GameObject> objectList = new ArrayList<>();
    private AnimationTimer gameTimer = new AnimationTimer() {
        @Override
        public void handle(long now) {
            updateAll();
        }
    };

    @FXML
    private void initialize() {
        objectList.add(new GameObject(ground1));
        objectList.add(new GameObject(ground2));
        objectList.add(new GameObject(ground3));

        objectList.add(new GameObject(box1));
        objectList.add(new GameObject(box2));
        objectList.add(new GameObject(box3));
        objectList.add(new GameObject(box4));
        objectList.add(new GameObject(box5));
        objectList.add(new GameObject(box6));
        objectList.add(new GameObject(box7));

        objectList.add(new GameObject(boxMove1));

        objectList.add(new GameObject(boxFinish1));
        objectList.add(new GameObject(boxFinish2));
        objectList.add(new GameObject(boxFinish3));
        objectList.add(new GameObject(boxFinish4));
        objectList.add(new GameObject(boxFinish5));
        objectList.add(new GameObject(boxFinish6));
        objectList.add(new GameObject(boxFinish7));
        objectList.add(new GameObject(boxFinish8));

        objectList.add(new GameObject(spike1));
        objectList.add(new GameObject(spike2));
        objectList.add(new GameObject(spike3));
        objectList.add(new GameObject(spike4));
        objectList.add(new GameObject(spike5));
        objectList.add(new GameObject(spike6));
        objectList.add(new GameObject(spike7));

        objectList.add(new GameObject(spikeMove1));
        objectList.add(new GameObject(spikeMove2));

        player = new Player(rectPlayer);
        objectList.add(player);

        player.setObjectList(objectList);

        gameTimer.start();
        GameObject.setCameraX(0);
        GameObject.setCameraY(0);

//        AnimationTimer timer = (l) -> {
//            for (GameObject o : objectList)
//                o.update();
//        };
//        timer.start();
    }

    private void updateAll() {
        GameObject.setCameraX(GameObject.getCameraX() + 1   );

        for (GameObject object : objectList) {
            object.update();
        }
    }

    // Move Controls
    @FXML
    protected void handleKeyPressed(KeyEvent e) {
        switch (e.getCode()) {
//            case LEFT -> player.moveLeft();
//            case RIGHT -> player.moveRight();
            case SPACE -> player.jump();
        }
    }

    @FXML
    protected void handleKeyReleased(KeyEvent e) {
        switch (e.getCode()) {
//            case LEFT -> player.moveLeft();
//            case RIGHT -> player.moveRight();
//            case SPACE -> player.jump();
        }
    }
}