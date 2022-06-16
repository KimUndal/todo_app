package com.example.todo_app.server.model;

import java.sql.Date;

public class Category implements Model{
    private int id;
    private String categoryName;
    private java.sql.Date createdAt;

    public Category() {
    }

    public Category(String categoryName) {
        this.categoryName = categoryName;
        this.createdAt = new Date(System.currentTimeMillis());
    }

    public Category(int id, String categoryName, Date createdAt) {
        this.id = id;
        this.categoryName = categoryName;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public java.sql.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.sql.Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
