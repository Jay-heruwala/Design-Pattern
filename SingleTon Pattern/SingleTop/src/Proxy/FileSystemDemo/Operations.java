package Proxy.FileSystemDemo;

public interface Operations {
    public boolean create(String fileName);
    public boolean remove(String fileName);
    public boolean rename(String oldName,String newName);
}
