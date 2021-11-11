package com.example.calculatorfx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        Vista vista = new Vista();
        Scene scene = new Scene(vista, 200, 200);
        stage.setTitle("Super Calculadora");
        stage.setScene(scene);
        stage.initStyle(StageStyle.DECORATED);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}