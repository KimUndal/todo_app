package com.example.todo_app.server.db.connection;

import com.example.todo_app.server.model.Category;
import com.example.todo_app.server.model.Model;

import java.sql.Connection;
import java.util.List;

public interface IIndex {

    void add(Model model);

    void delete(int id);


    void edit(Model model, int id);

    void edit(Model model, int id, int categoryId);

    Model getById(int id);

    Model getById(int id, int categoryId);

    List<Model> getAll();

    List<Model> getAll(int catId);
}
