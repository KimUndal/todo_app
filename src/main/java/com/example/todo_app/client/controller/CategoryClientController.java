package com.example.todo_app.client.controller;

import com.example.todo_app.server.controller.CategoryController;
import com.example.todo_app.server.model.Category;

public class CategoryClientController implements IController{
    private final CategoryController controller = new CategoryController();

    public void add(Category c){
        controller.add(c);
    }
}
