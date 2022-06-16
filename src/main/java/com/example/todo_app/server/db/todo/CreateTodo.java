package com.example.todo_app.server.db.todo;

import com.example.todo_app.server.db.CreateTable;

public class CreateTodo implements CreateTable {
    @Override
    public String sql() {

        return "CREATE TABLE IF NOT EXISTS Todo(" +
                "id serial primary key," +
                "task VARCHAR(255)," +
                "completed BOOLEAN," +
                "createdAt DATE," +
                "categoryId int," +
                "CONSTRAINT FK_CategoryTodo FOREIGN KEY (categoryId) REFERENCES Category(id)" +
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
