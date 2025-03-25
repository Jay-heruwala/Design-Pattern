package Proxy.FileSystem;

public interface FileOperations {
    Boolean createFile(String filePath);
    Boolean createFolder(String folderPath);
    Boolean deleteFile(String filePath);
    Boolean deleteFolder(String folderPath);
    Boolean renameFile(String oldPath, String newPath);
    Boolean renameFolder(String oldPath, String newPath);
}
