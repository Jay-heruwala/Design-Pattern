package Proxy.FileSystem;

public class FileProxy implements FileOperations{
    protected String role;
    protected RealFileOperations realFileOperations;

    public FileProxy(String role){
        this.realFileOperations = new RealFileOperations();
        this.role = role;
    }

    @Override
    public Boolean createFile(String filePath) {
        if(this.role.equalsIgnoreCase("admin")){
            return this.realFileOperations.createFile(filePath);
        }
        return false;
    }

    @Override
    public Boolean createFolder(String folderPath) {
        if(this.role.equalsIgnoreCase("admin")){
            return this.realFileOperations.createFolder(folderPath);
        }
        return false;
    }

    @Override
    public Boolean deleteFile(String filePath) {
        if(this.role.equalsIgnoreCase("admin")){
            return this.realFileOperations.deleteFile(filePath);
        }
        return false;
    }

    @Override
    public Boolean deleteFolder(String folderPath) {
        if(this.role.equalsIgnoreCase("admin")){
            return this.realFileOperations.deleteFolder(folderPath);
        }
        return false;
    }

    @Override
    public Boolean renameFile(String oldPath, String newPath) {
        if(this.role.equalsIgnoreCase("admin")){
            return this.realFileOperations.renameFile(oldPath,newPath);
        }
        return false;
    }

    @Override
    public Boolean renameFolder(String oldPath, String newPath) {
        if(this.role.equalsIgnoreCase("admin")){
            return this.realFileOperations.renameFolder(oldPath,newPath);
        }
        return false;
    }
}
