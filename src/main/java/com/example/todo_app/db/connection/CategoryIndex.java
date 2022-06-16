package com.example.todo_app.db.connection;

import com.example.todo_app.model.Category;
import com.example.todo_app.model.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CategoryIndex implements IIndex {
    private final static String INSERT_INTO_CATEGORY = "INSERT INTO Category VALUES(?, ?)";
    private final static String UPDATE_CATEGORY = "INSERT INTO Category";
    private final static String DELETE_CATEGORY="DELETE FROM Category";
    private final static String SELECT_CATEGORY="SELECT * FROM Category";
    private final static String SELECT_ALL_CATEGORIES="SELECT * FROM Category";
    static Connection connection = null;
    static PreparedStatement statement = null;
    @Override
    public Connection connect() {
        try{
            Class.forName("org.postgresql.Driver");
            System.out.println("Database Connected ..");
            return connection();


        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void add(Model model) {
        Category category = (Category) model;
        try{
            statement = connect().prepareStatement(INSERT_INTO_CATEGORY);
            statement.setString(1, category.getCategoryName());
            statement.setDate(2, category.getCreatedAt());
            statement.execute();
        }catch (SQLException e){
           throw new IllegalArgumentException(e);
        }

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void edit(Model model) {

    }

    @Override
    public Category get() {
        return null;
    }

    @Override
    public List<Category> getAll() {
        return null;
    }

    private static Connection connection() throws SQLException {
        return connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/todo",
                "postgres",
                "pourrainet43"
        );
    }

}
