package com.example.todo_app.server.db.connection;
import com.example.todo_app.server.db.CreateTable;
import com.example.todo_app.server.db.category.CreateCategory;
import com.example.todo_app.server.db.todo.CreateTodo;

import java.sql.*;
import java.util.List;

public class Index{
    static Connection connection = null;
    static Statement statement = null;

    public static void main(String[] args) {
        connect();
    }
    public static void connect() {
        try{
            Class.forName("org.postgresql.Driver");
            System.out.println("Database Connected ..");
            createTables();

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    private static void createTables() throws SQLException {
        CreateTable category = new CreateCategory();
        CreateTable todo = new CreateTodo();
        statement = Connector.connect().createStatement();
        List<CreateTable> tables = List.of(category, todo);
        for (CreateTable table : tables) {
            statement.executeUpdate(table.sql());
            System.out.println("Tables that have been created: " + table.getName());
        }
        statement.close();
    }


}
