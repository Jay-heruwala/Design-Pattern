package Proxy.FileSystemDemo;

import java.io.File;
import java.io.IOException;

public class FileOperations implements Operations{
    @Override
    public boolean create(String fileName) {
        File file = new File(fileName);
        try{
        if(!file.exists()){
            return  file.createNewFile();
        }
        }catch (IOException e){
            return false;
        }
        return false;
    }

    @Override
    public boolean remove(String fileName) {
        File file = new File(fileName);
        if(file.exists() && file.isFile()){
            return file.delete();
        }
        return false;
    }

    @Override
    public boolean rename(String oldName, String newName) {
        File file = new File(oldName);
        if(file.exists() && file.isFile()){
            return file.renameTo(new File(newName));
        }
        return false;
    }
}
