package Factory.Database;

public class MySQLConnection implements DatabaseConnection {



    @Override
    public String connect() {
        return ("Connected to MySQL Database.");
    }

    @Override
    public String query() {
        return ("Executing query: SELECT * FROM users.");
    }

    @Override
    public String disconnect() {
        return ("MySQL Database connection closed.");
    }
}