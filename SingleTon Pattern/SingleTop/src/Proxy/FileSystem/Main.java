package Proxy.FileSystem;



public class Main {
    public static void main(String[] args) {
        FileOperations fileSystem = new FileProxy("admin");

        System.out.println("Folder created : " + fileSystem.createFolder("Jay"));
        System.out.println("File   created : " + fileSystem.createFile("Jay/jay.txt"));

        System.out.println("Folder Renamed : " + fileSystem.renameFolder("Jay","JayHeruwala"));
        System.out.println("File   Renamed : " + fileSystem.renameFile("JayHeruwala/jay.txt","JayHeruwala/JayH.txt"));

        System.out.println("File   Deleted : " + fileSystem.deleteFile("JayHeruwala/JayH.txt"));
        System.out.println("Folder Deleted : " + fileSystem.deleteFolder("JayHeruwala"));


    }
}
