package com.stackroute.jdbc;


import com.mysql.cj.xdevapi.SqlDataResult;

import java.sql.*;
import java.util.ArrayList;

import static java.sql.DriverManager.*;


public class DatabaseMetadataDemo
{
     DatabaseMetaData databaseMetaData;
    Connection connection = null;

    public void getDatabaseMetadataDemo()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try
        {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/poojitha", "root", "Root@123");
            databaseMetaData = connection.getMetaData();

            System.out.println("Driver name is "+databaseMetaData.getDriverName());
            System.out.println("Driver version is "+databaseMetaData.getDriverVersion());
            System.out.println("user name is "+databaseMetaData.getUserName());
            System.out.println("Database product name"+databaseMetaData.getDatabaseProductName());
            System.out.println("Database product version"+databaseMetaData.getDatabaseProductVersion());

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList getTablesMetadata() throws SQLException {
        connection = getConnection("jdbc:mysql://localhost:3306/poojitha", "root", "Root@123");
        databaseMetaData = connection.getMetaData();


        String table[] = { "TABLE" };
        ResultSet rs = null;
        ArrayList tables = null;
        rs = databaseMetaData.getTables(null,null,null,table);
        tables = new ArrayList();
        while (rs.next()) {
            tables.add(rs.getString("TABLE_NAME"));
        }
        return tables;
    }


    }
