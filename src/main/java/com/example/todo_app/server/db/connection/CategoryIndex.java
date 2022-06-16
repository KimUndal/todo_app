package com.example.todo_app.server.db.connection;

import com.example.todo_app.server.model.Category;
import com.example.todo_app.server.model.Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.example.todo_app.server.db.connection.Connector.connect;


public class CategoryIndex implements IIndex {
    private final static String INSERT_INTO_CATEGORY = "INSERT INTO category(categoryname, createdat) VALUES(?, ?);";
    private final static String UPDATE_CATEGORY = "UPDATE category set categoryName = ?";
    private final static String DELETE_CATEGORY="DELETE FROM Category WHERE id = ";
    private final static String SELECT_ALL_CATEGORIES="SELECT * FROM category ";
    static PreparedStatement statement = null;


    @Override
    public void add(Model model) {
        Category category = (Category) model;
        try{
            statement = connect().prepareStatement(INSERT_INTO_CATEGORY);
            statement.setString(1, category.getCategoryName());
            statement.setDate(2, category.getCreatedAt());
            statement.execute();
            statement.close();
        }catch (SQLException e){
           throw new IllegalArgumentException(e);
        }

    }

    @Override
    public void delete(int id) {
        if (id < 0) throw new IllegalStateException("wrong id");
        try{
            statement = connect().prepareStatement(DELETE_CATEGORY.concat(String.valueOf(id)));
            statement.execute();
            statement.close();
        }catch (SQLException e){
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public void edit(Model model, int id) {
        Category category = (Category) model;
        try{
            statement = connect().prepareStatement(UPDATE_CATEGORY.concat("WHERE id="+id+";"));
            statement.setString(1, category.getCategoryName());
            statement.execute();
            statement.close();
        }catch (SQLException e){
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public void edit(Model model, int id, int categoryId) {

    }

    @Override
    public Category getById(int id) {
        if(id < 0) return null;
        Category category;
        int catId = 0;
        String title="";
        java.sql.Date date=null;
        try{
            statement = connect().prepareStatement(SELECT_ALL_CATEGORIES.concat("WHERE id=" + id + ";"));
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                catId = rs.getInt(1);
                title = rs.getString(2);
                date = rs.getDate(3);
            }

            category = new Category(catId, title, date);
            statement.close();
        }catch (SQLException e){
            throw new IllegalArgumentException(e);
        }
        return category;
    }

    @Override
    public Model getById(int id, int categoryId) {
        return null;
    }

    @Override
    public List<Model> getAll() {
        List<Model> categoryList = new ArrayList<>();

        int catId;
        String title;
        java.sql.Date date;
        try{
            statement = connect().prepareStatement(SELECT_ALL_CATEGORIES);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                catId = rs.getInt(1);
                title = rs.getString(2);
                date = rs.getDate(3);
                categoryList.add(new Category(catId, title, date));
            }
            statement.close();
        }catch (SQLException e){
            throw new IllegalArgumentException(e);
        }
        return categoryList;
    }

    @Override
    public List<Model> getAll(int catId) {
        return null;
    }


}
