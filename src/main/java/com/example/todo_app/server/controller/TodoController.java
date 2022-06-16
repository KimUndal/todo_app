package com.example.todo_app.server.controller;

import com.example.todo_app.server.db.connection.TodoIndex;
import com.example.todo_app.server.model.Category;
import com.example.todo_app.server.model.Model;
import com.example.todo_app.server.model.Todo;

import java.util.List;

public class TodoController {

    private final TodoIndex index = new TodoIndex();

    public boolean add(Todo todo){
        try {
            if (!todo.getTask().equals("")) {
                index.add(todo);
                return true;
            }
        } catch (Exception e){
            throw new IllegalStateException(e);
        }
        return false;
    }

    public boolean edit(Todo todo) {
        try {
            if (!todo.getTask().equals("")) {
                index.edit(todo, todo.getId(), todo.getCategoryId());
                return true;
            }
        } catch (Exception e){
            throw new IllegalStateException(e);
        }
        return false;
    }

    public Model getById(int id, int catId) {
        return index.getById(id, catId);
    }

    public List<Model> getAll(int catId) {
        return index.getAll(catId);
    }

    public boolean delete(int id, int catId) {
        Todo todo =(Todo) getById(id, catId);
        if(todo == null) return false;
        if (todo.getId() == id) {
            index.delete(id);
            return true;
        }
        return false;
    }
}
