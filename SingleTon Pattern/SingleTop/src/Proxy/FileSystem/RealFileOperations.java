package Proxy.FileSystem;

import java.io.File;
import java.io.IOException;

public class RealFileOperations implements FileOperations{

    @Override
    public Boolean createFile(String filePath) {
        File file = new File(filePath);
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
    public Boolean createFolder(String folderPath) {
        File file = new File(folderPath);
        if(!file.exists()){
            return file.mkdir();
        }
        return false;
    }

    @Override
    public Boolean deleteFile(String filePath) {
        File file = new File(filePath);
        if(file.exists() && file.isFile()){
            return file.delete();
        }
        return false;
    }

    @Override
    public Boolean deleteFolder(String folderPath) {
        File file = new File(folderPath);
        if(file.exists() && file.isDirectory()){
            return  file.delete();
        }
        return false;
    }

    @Override
    public Boolean renameFile(String oldPath, String newPath) {
        File file = new File(oldPath);
        if(file.exists() && file.isFile()){
            return file.renameTo(new File(newPath));
        }
        return false;
    }

    @Override
    public Boolean renameFolder(String oldPath, String newPath) {
        File file = new File(oldPath);
        File rename = new File(newPath);
        if(file.exists() && file.isDirectory()){
            return file.renameTo(rename);
        }
        return false;
    }
}
