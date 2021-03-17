//Class:		CSE 1322L
//Section: 		04
//Term:			Fall 2020
//Instructor:	Joseph Tierno
//Name:			Jason Flores
//Assignment#:			8

/*
 */

package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(new Scene(root, 382, 454));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
