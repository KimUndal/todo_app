package com.example.todo_app.server.db;

import com.example.todo_app.server.db.connection.Index;

public class Main {
    public static void main(String[] args) {
        Index index = new Index();
        index.connect();
    }
}
