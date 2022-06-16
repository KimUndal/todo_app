package com.example.todo_app.server.model;

import java.sql.Date;

public class Todo implements Model{
    private int id;
    private String task;
    private boolean completed;
    private Date createdAt;

    private int categoryId;

    public Todo() {
    }


    public Todo(String task, boolean completed, Date createdAt) {
        this.task = task;
        this.completed = completed;
        this.createdAt = createdAt;
    }

    public Todo(String task) {
        this.task = task;
    }

    public Todo(String task, int categoryId){
        this.task = task;
        this.categoryId = categoryId;
        this.createdAt = new Date(System.currentTimeMillis());
    }

    public Todo(String task, boolean completed,  Date createdAt, int categoryId) {
        this.task = task;
        this.completed = completed;
        this.createdAt = createdAt;
        this.categoryId = categoryId;
    }

    public Todo(String task, int id, int categoryId) {
        this.task = task;
        this.id = id;
        this.categoryId = categoryId;
        createdAt = new Date(System.currentTimeMillis());
    }

    public Todo(int todoId, String task, boolean completed, Date date, int catId) {
        id = todoId;
        this.task = task;
        this.completed = completed;
        createdAt = date;
        categoryId = catId;
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", completed=" + completed +
                ", categoryId='" + categoryId + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
