package com.example.todo_app.db.todo;

import com.example.todo_app.db.CreateTable;

public class CreateTodo implements CreateTable {
    @Override
    public String sql() {

        return "CREATE TABLE IF NOT EXISTS Todo(" +
                "id serial primary key," +
                "task VARCHAR(255)," +
                "completed BOOLEAN," +
                "createdAt DATE," +
                "FOREIGN KEY (id) REFERENCES Category(id)" +
                ")";
    }

    @Override
    public String delete() {
        return "DROP TABLE IF EXISTS Todo";
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName().replace("Create", "").toUpperCase();
    }


}
