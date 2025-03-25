package JDBC;

import java.sql.*;
import java.util.Stack;

public class DB {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Programs","root","Root");
        System.out.println("Connection successfully");

        Statement statement = connection.createStatement();
        int succ = statement.executeUpdate("insert into exam values('Jay' , 20)");
        System.out.println(succ);

        ResultSet resultSet = statement.executeQuery("select * from exam");
        while(resultSet.next()){
            System.out.println(resultSet.getString("name") + "    " + resultSet.getString("age"));
        }


        PreparedStatement preparedStatement = connection.prepareStatement("select * from exam where age = ?");
        preparedStatement.setString(1,"10");

        System.out.println("New : ");
        resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            System.out.println(resultSet.getString("name") + "    " + resultSet.getString("age"));
        }
    }
}
