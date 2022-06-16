package com.example.todo_app.service;

import com.example.todo_app.model.Category;

import java.util.List;

public interface ICategoryService {

    void addCategory(Category category);
    void editCategory(Category category);
    void deleteCategory(int id);
    Category getCategory(int id);
    List<Category> getAllCategories();
}
