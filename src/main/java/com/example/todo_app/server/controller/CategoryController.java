package com.example.todo_app.server.controller;

import com.example.todo_app.server.db.connection.CategoryIndex;
import com.example.todo_app.server.exceptions.MissingTitleException;
import com.example.todo_app.server.model.Category;
import com.example.todo_app.server.model.Model;

import java.util.List;

public class CategoryController {
    private final CategoryIndex index = new CategoryIndex();

    public boolean add(Category category){
        try {
            if (!category.getCategoryName().equals("")) {
                index.add(category);
                return true;
            }
        } catch (Exception e){
            throw new IllegalStateException(e);
        }
        return false;
    }

    public boolean edit(Category category, int id) {
        try {
            if (!category.getCategoryName().equals("")) {
                index.edit(category, id);
                return true;
            }
        } catch (Exception e){
            throw new IllegalStateException(e);
        }
        return false;
    }

    public boolean delete(int id) {
        Category category = getById(id);
        if(category == null) return false;
        if (category.getId() == id) {
            index.delete(id);
            return true;
        }
        return false;
    }

    public Category getById(int id) {
        return index.getById(id);
    }

    public List<Model> getAll() {
        return index.getAll();
    }


}
