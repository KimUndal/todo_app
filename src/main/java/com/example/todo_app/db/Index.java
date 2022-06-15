package com.example.todo_app.db;
import com.example.todo_app.db.category.CreateCategory;
import com.example.todo_app.db.todo.CreateTodo;
import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvBuilder;

import java.sql.*;
import java.util.List;

public class Index {
    static Connection connection = null;
    static Statement statement = null;
    public static void main(String[] args) {
        connect();
    }

    private static void connect() {

        try{
            Class.forName("org.postgresql.Driver");
            connection();
            System.out.println("Database Connected ..");
            createTables();

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void connection() throws SQLException {


        connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/todo",
                "postgres",
                "pourrainet43"
        );
    }

    private static void createTables() throws SQLException {
        CreateTable category = new CreateCategory();
        CreateTable todo = new CreateTodo();
        statement = connection.createStatement();
        List<CreateTable> tables = List.of(category, todo);
        for (CreateTable table : tables) {
            statement.executeUpdate(table.sql());
            System.out.println("Tables that have been created: " + table.getName());
        }
        statement.close();
        connection.close();
    }


}
