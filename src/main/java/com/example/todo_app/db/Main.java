package com.example.todo_app.db;

import com.example.todo_app.db.connection.Index;

public class Main {
    public static void main(String[] args) {
        Index index = new Index();
        index.connect();
    }
}
