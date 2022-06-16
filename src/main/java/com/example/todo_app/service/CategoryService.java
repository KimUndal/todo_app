package com.example.todo_app.service;

import com.example.todo_app.db.category.CategoryQuery;
import com.example.todo_app.model.Category;

import java.util.List;

public class CategoryService implements ICategoryService{

    private final CategoryQuery categoryQuery;

    public CategoryService(CategoryQuery categoryQuery) {
        this.categoryQuery = categoryQuery;
    }

    @Override
    public void addCategory(Category category) {
        categoryQuery.addCategory(category);
    }

    @Override
    public void editCategory(Category category) {

    }

    @Override
    public void deleteCategory(int id) {

    }

    @Override
    public Category getCategory(int id) {
        return null;
    }

    @Override
    public List<Category> getAllCategories() {
        return null;
    }
}
