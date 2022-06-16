package com.example.todo_app.client;

import com.example.todo_app.TodoApplication;
import com.example.todo_app.client.components.panes.MainPaine;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TodoView {
    public void view(Stage stage) throws IOException {
        MainPaine mainPaine = new MainPaine();
        double width = mainPaine.getWidth();
        double height = mainPaine.getHeight();
        Scene scene = new Scene(mainPaine, width, height);
        stage.setTitle("Todo Application");
        stage.setScene(scene);
        stage.show();
    }

}
