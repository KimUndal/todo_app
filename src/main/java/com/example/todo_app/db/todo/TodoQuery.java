package com.example.todo_app.db.todo;

import com.example.todo_app.model.Todo;
import com.example.todo_app.service.ITodoService;

import java.util.List;

public class TodoQuery implements ITodoService {


    @Override
    public boolean addTodo(Todo todo) {
        return false;
    }

    @Override
    public boolean editTodo(Todo todo) {
        return false;
    }

    @Override
    public boolean deleteTodo(int id) {
        return false;
    }

    @Override
    public Todo getTodo(Todo todo) {
        return null;
    }

    @Override
    public List<Todo> getAllTodos() {
        return null;
    }
}
