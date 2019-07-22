package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;

public class ResultSetMetadataDemo {

    DatabaseMetaData databaseMetaData;
    Connection connection = null;

    public void getColumnsMetadata()
            throws SQLException {
        connection = getConnection("jdbc:mysql://localhost:3306/poojitha", "root", "Root@123");
        databaseMetaData = connection.getMetaData();
        ResultSet resultSet = databaseMetaData.getColumns(null, null, "employee", null);
        while (resultSet.next()) {
            String name = resultSet.getString("COLUMN_NAME");
            String type = resultSet.getString("TYPE_NAME");
            int size = resultSet.getInt("COLUMN_SIZE");

            System.out.println("Column name: [" + name + "]; type: [" + type + "]; size: [" + size + "]");
        }

    }
}
