package Proxy.FileSystemDemo;

public class Main {

    public static void main(String[] args) {

        Operations folderOperations = new Proxy("admin");

        System.out.println("Folder created : " + folderOperations.create("jay"));
        System.out.println("Folder Renamed : " + folderOperations.rename("jay","jayHeruwala"));
//        System.out.println("Folder Deleted : " + folderOperations.remove("jayHeruwala"));

        FileOperations fileOperations = new FileOperations();
        System.out.println("File created : " + fileOperations.create("jayHeruwala/Jay_Heruwala.txt"));
        System.out.println("File Renamed : " + fileOperations.rename("jayHeruwala/Jay_Heruwala.txt","jayHeruwala/Dev"));
//        System.out.println("File Deleted : " + fileOperations.remove("Dev"));
    }
}
