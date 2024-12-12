package net.artem.javacore.jdbc.application;

import java.sql.*;

public class DeleteRecordsJdbc {
    static final String DATABASE_URL = "jdbc:mysql://localhost/proselyte_tutorials";
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    static final String USER = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        try {
            System.out.println("Register JDBC driver ");
            Class.forName(JDBC_DRIVER);

            System.out.println("Creating connection to database  ");
            connection = DriverManager.getConnection(DATABASE_URL,USER,PASSWORD);

            System.out.println("Getting records ...");
            statement = connection.createStatement();

            String SQL = "SELECT * FROM developer";
            ResultSet resultSet = statement.executeQuery(SQL);
             while (resultSet.next()){
                 int id = resultSet.getInt(1);
                 String name = resultSet.getString(2);
                 String speciality = resultSet.getString(3);
                 int salary = resultSet.getInt(4);
                 System.out.println("=====================");

                 System.out.println("\n*************************\n");
             }
            System.out.println("Remiving record with id = 4");
             SQL = "DELETE FROM developer WHERE id = 4";
             statement.executeUpdate(SQL);

            System.out.println("Getting records ...");
            SQL = "SELECT * FROM developer";

            resultSet = statement.executeQuery(SQL);
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String speciality = resultSet.getString(3);
                int salary = resultSet.getInt(4);

                System.out.println("id " + id);
                System.out.println("Name " + name);
                System.out.println("Spesialty " + speciality);
                System.out.println("Salary " + salary);
                System.out.println("=================\n");
            }


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if (statement != null){
                statement.close();
            }if (connection != null){
                connection.close();
            }
        }
    }
}
