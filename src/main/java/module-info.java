module com.example.todo_app {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.postgresql.jdbc;


    opens com.example.todo_app to javafx.fxml;
    exports com.example.todo_app;
}