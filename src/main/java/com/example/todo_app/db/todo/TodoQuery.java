package com.example.todo_app.db.todo;

import com.example.todo_app.model.Todo;
import com.example.todo_app.service.TodoService;

public class TodoQuery {
    private final TodoService todoService;

    public TodoQuery(TodoService todoService) {
        this.todoService = todoService;
    }


}
