package com.example.todo_app.db.category;

import com.example.todo_app.db.CreateTable;

public class CreateCategory implements CreateTable {
    @Override
    public String sql() {

        return "CREATE TABLE IF NOT EXISTS Category(" +
                "id serial primary key," +
                "categoryName VARCHAR(255)," +
                "createdAt DATE" +
                ")";
    }

    @Override
    public String delete() {
        return "DROP TABLE IF EXISTS Category";
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName().replace("Create", "").toUpperCase();
    }

}
