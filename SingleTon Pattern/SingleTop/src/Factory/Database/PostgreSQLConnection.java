package Factory.Database;

public class PostgreSQLConnection implements DatabaseConnection {
    @Override
    public String connect() {
        return("Connected to PostgreSQL Database.");
    }

    @Override
    public String query() {
        return("Executing query: SELECT * FROM orders.");
    }

    @Override
    public String disconnect() {
        return("PostgreSQL Database connection closed.");
    }
}