
package hu.unideb.inf;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database  {


    private static final String DATABASE_URL = "jdbc:sqlserver://sfmadatbazis.database.windows.net:1433;database=sfmadatbazis";
    private static final String DATABASE_USERNAME = "Kdr123";
    private static final String DATABASE_PASSWORD = "Kdrteam123";
    private static final String SELECT_QUERY = "SELECT * FROM users WHERE username = ? and userpassword = ?";
    private static final String INSERT_QUERY = "INSERT INTO users (username,email,userpassword,teljesnev,szuldatum,szemelyigazolvany,lakcimkartya,tajkartya ) " +
            "VALUES (?, ?, ?, ?, ?,?, ?, ?)";
    private static final String INSERT_QUERY_UGYEK = "INSERT INTO ugyek (teljesnev, ugy, sorszam, idopont) VALUES (?, ?, ?, ?)";


    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DATABASE_URL);
            JOptionPane.showMessageDialog(null, "Sikeres");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }

        //Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);

        //return connection;

    }

    public boolean validate(String username, String userpassword) throws SQLException {

        // Step 1: Establishing a Connection and
        // try-with-resource statement will auto close the connection.
        try (Connection connection = DriverManager
                .getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_QUERY)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, userpassword);


            System.out.println(preparedStatement);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return true;
            }


        } catch (SQLException e) {
            // print SQL exception information++
            printSQLException(e);
        }
        return false;
    }


    public void insertRecord(String username, String email, String userpassword, String teljesnev, String szuldatum, String szemelyigazolvany,String lakcimkartya,String tajkartya) throws SQLException {

        // Step 1: Establishing a Connection and
        // try-with-resource statement will auto close the connection.
        try (Connection connection = DriverManager
                .getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, userpassword);
            preparedStatement.setString(4, teljesnev);
            preparedStatement.setString(5, szuldatum);
            preparedStatement.setString(6, szemelyigazolvany);
            preparedStatement.setString(7, lakcimkartya);
            preparedStatement.setString(8, tajkartya);

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            // print SQL exception information
            printSQLException(e);
        }
    }

    public void insertRecordUgyek(String teljesnev, String ugy, String sorszam, String idopont){
        // Step 1: Establishing a Connection and
        // try-with-resource statement will auto close the connection.
        try (Connection connection = DriverManager
                .getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY_UGYEK)) {
            preparedStatement.setString(1, teljesnev);
            preparedStatement.setString(2, ugy);
            preparedStatement.setString(3, sorszam);
            preparedStatement.setString(4, idopont);

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            // print SQL exception information
            printSQLException(e);

        }
    }

    public static ObservableList<Cases> getDatacases()throws SQLException{

        Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
        ObservableList<Cases> list = FXCollections.observableArrayList();
        try{
            PreparedStatement ps = connection.prepareStatement("select * from ugyek where teljesnev='"+ GuiController.globalteljesnev +"'");
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                list.add(new Cases(rs.getString("teljesnev"), rs.getString("ugy"),rs.getString("sorszam"),rs.getString("idopont")));
            }
        } catch (SQLException e){
                printSQLException(e);
        }

        return list;
    }

    public static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}