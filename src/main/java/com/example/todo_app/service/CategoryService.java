package com.example.todo_app.service;

import com.example.todo_app.model.Category;
import com.example.todo_app.model.Todo;

import java.util.List;

public interface CategoryService {

    boolean added(Category category);
    boolean edited(Category category);
    boolean deleted(int id);
    Category getCategory(Category category);
    List<Category> getAllCategories();
}
