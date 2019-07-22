package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcBatchDemo
{


    public void getJdbcBatch()
    {

        try
        {
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/poojitha", "root", "Root@123");
           connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            System.out.println("fd");
            statement.addBatch("insert into employee values(105,'venu',49,'male')");
            statement.addBatch("insert into employee values(106,'indu',43,'female')");
            System.out.println("fds");
            statement.executeBatch();
            connection.commit();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
