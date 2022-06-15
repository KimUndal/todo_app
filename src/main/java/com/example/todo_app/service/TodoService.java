package com.example.todo_app.service;

import com.example.todo_app.model.Todo;

import java.util.List;

public interface TodoService {
    boolean added();
    boolean edited();
    boolean deleted();
    Todo getTodo();
    List<Todo> getAllTodos();
}
