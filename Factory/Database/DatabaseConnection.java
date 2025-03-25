package Factory.Database;

interface DatabaseConnection {
    String connect();
    String query();
    String disconnect();
}