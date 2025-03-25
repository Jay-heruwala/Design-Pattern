package Factory.Database;

import java.util.Scanner;


public class DatabaseConnectionManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String performQuery;
        System.out.print("Enter the database type (mysql, postgresql, mongodb):");
        String dbType = scanner.next();

        try {

            DatabaseConnection dbConnection = DatabaseFactory.getDatabaseConnection(dbType);

            //Connection establish
            System.out.println(dbConnection.connect());


            //perform a Query
            System.out.print("Are you want to perform a query? [yes,no] :");
            performQuery = scanner.next();
            if(performQuery.equalsIgnoreCase("yes")){
                System.out.println("Performing query...");
                System.out.println(dbConnection.query());
            }


            //Disconnect the database
            System.out.println(dbConnection.disconnect());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}