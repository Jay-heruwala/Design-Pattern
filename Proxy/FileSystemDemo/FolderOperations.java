package Proxy.FileSystemDemo;

import java.io.File;

public class FolderOperations implements Operations {
    @Override
    public boolean create(String fileName) {
        File file = new File(fileName);
        if(!file.exists()){
            return file.mkdir();
        }
        return false;
    }

    @Override
    public boolean remove(String fileName) {
        File file = new File(fileName);
        if(file.exists() && file.isDirectory()){
            return  file.delete();
        }
        return false;
    }

    @Override
    public boolean rename(String oldName, String newName) {
        File file = new File(oldName);
        File rename = new File(newName);
        if(file.exists() && file.isDirectory()){
            return file.renameTo(new File(newName));
        }
        return false;
    }
}
