package com.example.todo_app.service;

import com.example.todo_app.model.Category;
import com.example.todo_app.model.Todo;

import java.util.List;

public interface CategoryService {

    boolean added();
    boolean edited();
    boolean deleted();
    Category getCategory();
    List<Category> getAllCategories();
}
