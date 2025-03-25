package Factory.Database;

public class DatabaseFactory {
    public static DatabaseConnection getDatabaseConnection(String dbType) {
        switch (dbType.toLowerCase()) {
            case "mysql":
                return new MySQLConnection();
            case "postgresql":
                return new PostgreSQLConnection();
            case "mongodb":
                return new MongoDBConnection();
            default:
                throw new IllegalArgumentException("Invalid database type: " + dbType);
        }
    }
}