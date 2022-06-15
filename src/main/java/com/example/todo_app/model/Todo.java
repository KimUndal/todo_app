package com.example.todo_app.model;

import java.util.Date;

public class Todo {
    private int id;
    private String task;
    private boolean completed;
    private String category;
    private Date createdAt;

    public Todo(String task, boolean completed, String category, Date createdAt) {
        this.task = task;
        this.completed = completed;
        this.category = category;
        this.createdAt = createdAt;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
