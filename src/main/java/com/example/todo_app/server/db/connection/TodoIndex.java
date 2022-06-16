package com.example.todo_app.server.db.connection;

import com.example.todo_app.server.model.Model;
import com.example.todo_app.server.model.Todo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.example.todo_app.server.db.connection.Connector.connect;

public class TodoIndex implements IIndex {
    private final static String INSERT_INTO_TODO = "INSERT INTO todo(task, completed, createdat, categoryid) VALUES(?, ?, ?, ?);";
    private final static String UPDATE_TODO = "UPDATE todo set task = ?";
    private final static String DELETE_TODO="DELETE FROM todo WHERE id = ";
    private final static String SELECT_ALL_TODOS="SELECT * FROM todo ";
    static PreparedStatement statement = null;


    @Override
    public void add(Model model) {
        Todo todo = (Todo) model;
        todo.setCompleted(false);
        try{
            statement = connect().prepareStatement(INSERT_INTO_TODO);
            statement.setString(1, todo.getTask());
            statement.setBoolean(2, todo.isCompleted());
            statement.setDate(3, todo.getCreatedAt());
            statement.setInt(4, todo.getCategoryId());
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
            statement = connect().prepareStatement(DELETE_TODO.concat(String.valueOf(id)));
            statement.execute();
            statement.close();
        }catch (SQLException e){
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public void edit(Model model, int id) {

    }

    @Override
    public void edit(Model model, int id, int categoryId) {
        if(id < 0 || categoryId < 0) throw new IllegalArgumentException("ID is invalid");
        Todo todo = (Todo) model;
        try{
            statement = connect().prepareStatement(UPDATE_TODO.concat("WHERE id="+id+ " AND categoryId=" + categoryId));
            statement.setString(1, todo.getTask());
            statement.execute();
            statement.close();
        }catch (SQLException e){
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public Model getById(int id) {
        return null;
    }

    @Override
    public Model getById(int id, int categoryId) {
        if(id < 0 || categoryId < 0) return null;
        Todo todo;
        int todoId = 0;
        String task="";
        boolean completed = false;
        java.sql.Date date=null;
        int catId = 0;
        try{
            statement = connect().prepareStatement(SELECT_ALL_TODOS.concat("WHERE id=" + id + " AND categoryid= " + categoryId+";"));
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                todoId = rs.getInt(1);
                task = rs.getString(2);
                completed = rs.getBoolean(3);
                date = rs.getDate(4);
                catId = rs.getInt(5);

            }

            todo = new Todo(todoId, task, completed, date, catId);
            statement.close();
        }catch (SQLException e){
            throw new IllegalArgumentException(e);
        }
        return todo;
    }

    @Override
    public List<Model> getAll() {
        return null;
    }

    @Override
    public List<Model> getAll(int catId) {
        List<Model> todoList = new ArrayList<>();
        int todoId = 0;
        String task="";
        boolean completed = false;
        java.sql.Date date=null;
        try{
            statement = connect().prepareStatement(SELECT_ALL_TODOS + " WHERE categoryid = " + catId);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                todoId = rs.getInt(1);
                task = rs.getString(2);
                completed = rs.getBoolean(3);
                date = rs.getDate(4);
                catId = rs.getInt(5);
                todoList.add(new Todo(todoId, task, completed, date, catId));
            }
            statement.close();
        }catch (SQLException e){
            throw new IllegalArgumentException(e);
        }
        return todoList;
    }
}
