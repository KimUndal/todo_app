module com.example.todo_app {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.postgresql.jdbc;
    requires dotenv.java;


    opens com.example.todo_app to javafx.fxml;
    exports com.example.todo_app;
}