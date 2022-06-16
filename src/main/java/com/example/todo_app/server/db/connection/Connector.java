package com.example.todo_app.server.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

    public static Connection connect() {
        try{
            Class.forName("org.postgresql.Driver");
            System.out.println("Database Connected ..");
            return connection();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static Connection connection() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/todo",
                "postgres",
                "pourrainet43"
        );
    }

}
