/* Design and implement a Database Connection Manager for a Student Management System using the Singleton
design pattern. The system should maintain a single instance of the database connection throughout the
application's lifecycle to efficiently manage database resources and prevent multiple
unnecessary connections. */


package SingleTonClass;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        DatabaseConnectionManager databaseConnectionManager = DatabaseConnectionManager.getConnection();
        DatabaseConnectionManager databaseConnectionManager1 = DatabaseConnectionManager.getConnection();
        System.out.println(databaseConnectionManager.hashCode());
        System.out.println(databaseConnectionManager1.hashCode());


        try{
            DatabaseConnectionManager databaseConnectionManager2 = (DatabaseConnectionManager) databaseConnectionManager1.clone();
            System.out.println(databaseConnectionManager2.hashCode());

        }catch (CloneNotSupportedException e){
            System.out.println("Error : " + e.getMessage());
        }




    }
}
