package com.example.todo_app.service;

import com.example.todo_app.model.Todo;

import java.util.List;

public interface ITodoService {
    boolean addTodo(Todo todo);
    boolean editTodo(Todo todo);
    boolean deleteTodo(int id);
    Todo getTodo(Todo todo);
    List<Todo> getAllTodos();
}
