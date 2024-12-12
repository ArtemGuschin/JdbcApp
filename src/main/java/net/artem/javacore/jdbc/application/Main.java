package net.artem.javacore.jdbc.application;

import java.sql.*;

public class Main {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/proselyte_tutorials";

    static final String USER = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement = null;


        try {
            System.out.println("Register Jdbc driver");
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Creating database connection");
        connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);

        System.out.println("Executing statement");
        statement = connection.createStatement();

        String sql;
        sql = "SELECT*FROM developer";

        ResultSet resultSet = statement.executeQuery(sql);

        System.out.println("Retriving data from database ");
        System.out.println("\nDevelopers :");

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String speciality = resultSet.getString("speciality");
            int salary = resultSet.getInt("salary");


            System.out.println("\n==================");
            System.out.println("id: " + id);
            System.out.println("Name :" + name);
            System.out.println("Specialty :" + speciality);
            System.out.println("Salary : " + salary);

        }
        System.out.println("Closing all ");
        resultSet.close();
        statement.close();
        connection.close();


    }

}