package Proxy.FileSystemDemo;

public class Proxy implements Operations {

    Operations folderOperations = new FolderOperations();

    protected String role;

    Proxy(String role){
        this.role = role;
    }

    @Override
    public boolean create(String fileName) {

        if(this.role.equalsIgnoreCase("admin")){
            return folderOperations.create(fileName);
        }

        return false;
    }

    @Override
    public boolean remove(String fileName) {
        if(this.role.equalsIgnoreCase("admin")){
            return folderOperations.remove(fileName);
        }
        return false;
    }

    @Override
    public boolean rename(String oldName, String newName) {
        if(this.role.equalsIgnoreCase("admin")){
            return folderOperations.rename(oldName,newName);
        }
        return false;
    }
}
