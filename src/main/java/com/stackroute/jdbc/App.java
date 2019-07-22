package com.stackroute.jdbc;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
       /* //SimpleJdbcDemo simpleJdbcDemo = new SimpleJdbcDemo();
        //DatabaseMetadataDemo databaseMetadataDemo = new DatabaseMetadataDemo();
        //ResultSetMetadataDemo resultSetMetadataDemo = new ResultSetMetadataDemo();
        //RowSetDemo rowSetDemo = new RowSetDemo();
        JdbcTransactionDemo jdbcTransactionDemo = new JdbcTransactionDemo();
        JdbcBatchDemo jdbcBatchDemo = new JdbcBatchDemo();
       // simpleJdbcDemo.getEmployeeDetails();
      //  simpleJdbcDemo.getEmployeeDetailsInReverse();
       // simpleJdbcDemo.getEmployeeDetailsFromSecondRowInReverse();
    //    simpleJdbcDemo.getEmployeeDetailsByNameAndGender("poojitha","female");
        databaseMetadataDemo.getDatabaseMetadataDemo();
        System.out.println(databaseMetadataDemo.getTablesMetadata());
        resultSetMetadataDemo.getColumnsMetadata();
     //   jdbcTransactionDemo.getJdbcTransaction();
        jdbcBatchDemo.getJdbcBatch();
   //     rowSetDemo.getRowSet();
*/RowSetDemo rowSetDemo = new RowSetDemo();
        rowSetDemo.getRowSet();

    }
}
