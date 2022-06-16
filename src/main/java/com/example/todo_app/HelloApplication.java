package com.example.todo_app;

import com.example.todo_app.view.TodoView;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        TodoView todoView = new TodoView();
        todoView.view(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}