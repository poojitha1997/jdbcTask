package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTransactionDemo
{
    public void getJdbcTransaction()
    {
        try
        {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/poojitha", "root", "Root@123");
            connection.setAutoCommit(false);

            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into employee values(104,'chotu',14,'female')");
            connection.commit();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
