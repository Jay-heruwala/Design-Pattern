package SingleTonClass;

import java.sql.*;

public final class DatabaseConnectionManager implements Cloneable {
    private String URL = "jdbc:mysql://127.0.0.1:3306/jdbc";
    private String username = "root";
    private String password = "Root";
    Connection connection;
    static DatabaseConnectionManager connectionManager;


    private  DatabaseConnectionManager(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(URL,username,password);
            System.out.println("Connection Successfully");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
        throw new CloneNotSupportedException("Sorry Clone not Suppted");
    }


    public static DatabaseConnectionManager getConnection() {
        if(connectionManager == null){
                connectionManager = new DatabaseConnectionManager();
            }
        return  connectionManager;
    }
}

