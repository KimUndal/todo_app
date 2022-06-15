package com.example.todo_app.service;

import com.example.todo_app.model.Todo;

import java.util.List;

public interface TodoService {
    boolean added(Todo todo);
    boolean edited(Todo todo);
    boolean deleted(int id);
    Todo getTodo(Todo todo);
    List<Todo> getAllTodos();
}
