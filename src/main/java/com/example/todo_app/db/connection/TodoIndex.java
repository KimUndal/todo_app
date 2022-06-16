package com.example.todo_app.db.connection;

import com.example.todo_app.db.connection.IIndex;
import com.example.todo_app.model.Category;
import com.example.todo_app.model.Model;

import java.sql.Connection;
import java.util.List;

public class TodoIndex implements IIndex {

    @Override
    public Connection connect() {
        return null;
    }

    @Override
    public void add(Model model) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void edit(Model model) {

    }

    @Override
    public Category get() {
        return null;
    }

    @Override
    public List<Category> getAll() {
        return null;
    }
}
