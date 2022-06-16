package com.example.todo_app.controller;

import com.example.todo_app.model.Category;
import com.example.todo_app.service.CategoryService;

import java.util.List;

public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    public void addCategory(Category category){
        categoryService.addCategory(category);
    }

    public void editCategory(Category category){
        categoryService.editCategory(category);
    }

    public void deleteCategory(int id){
        categoryService.deleteCategory(id);
    }

    public Category getCategory(int id){
        return categoryService.getCategory(id);
    }

    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }
}
