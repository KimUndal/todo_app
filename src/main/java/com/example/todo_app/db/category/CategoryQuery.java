package com.example.todo_app.db.category;

import com.example.todo_app.db.connection.CategoryIndex;
import com.example.todo_app.model.Category;
import com.example.todo_app.service.ICategoryService;

import java.sql.SQLException;
import java.util.List;

public class CategoryQuery implements ICategoryService {


    private final CategoryIndex categoryIndex;

    public CategoryQuery(CategoryIndex categoryIndex) {
        this.categoryIndex = categoryIndex;
    }

    @Override
    public void addCategory(Category category) {
        categoryIndex.add(category);
    }

    @Override
    public void editCategory(Category category) {

    }

    @Override
    public void deleteCategory(int id) {

    }

    @Override
    public Category getCategory(int category) {
        return null;
    }

    @Override
    public List<Category> getAllCategories() {
        return null;
    }
}
