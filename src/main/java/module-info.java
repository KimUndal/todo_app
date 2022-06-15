module com.example.todo_app {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.todo_app to javafx.fxml;
    exports com.example.todo_app;
}