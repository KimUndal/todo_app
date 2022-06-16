package com.example.todo_app.db.connection;

import com.example.todo_app.model.Category;
import com.example.todo_app.model.Model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface IIndex {
    Connection connect();
    void add(Model model);
    void delete(int id);
    void edit(Model model);
    Category get();
    List<Category> getAll();
}
