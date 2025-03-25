package Factory.Database;

public class MongoDBConnection implements DatabaseConnection {
    @Override
    public String connect() {
        return("Connected to MongoDB Database.");
    }

    @Override
    public String query() {
        return("Executing query: db.collection.find({}).");
    }

    @Override
    public String disconnect() {
        return("MongoDB Database connection closed.");
    }
}