package com.example.labb4_soduku;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import View.SudokuView.*;



/**
 * Creates a window and ties model, view and controller together.
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        //View view = new View();
        //Scene scene = new Scene(view, 420, 350);
        primaryStage.setTitle("Sudoku Game");
       // primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
