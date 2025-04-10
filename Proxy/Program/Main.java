package Proxy.Program;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

// 1. Subject Interface
interface DirectoryService {
    void createDirectory(String path) throws Exception;
    void renameDirectory(String oldPath, String newPath) throws Exception;
    void deleteDirectory(String path) throws Exception;
}

// 2. Real Subject (Concrete Implementation)
class RealDirectoryService implements DirectoryService {
    @Override
    public void createDirectory(String path) throws Exception {
        File dir = new File(path);
        if (!dir.mkdir()) {
            throw new Exception("Failed to create directory: " + path);
        }
        System.out.println("Directory created: " + path);
    }

    @Override
    public void renameDirectory(String oldPath, String newPath) throws Exception {
        File oldDir = new File(oldPath);
        File newDir = new File(newPath);
        if (!oldDir.renameTo(newDir)) {
            throw new Exception("Failed to rename directory from " + oldPath + " to " + newPath);
        }
        System.out.println("Directory renamed from " + oldPath + " to " + newPath);
    }

    @Override
    public void deleteDirectory(String path) throws Exception {
        File dir = new File(path);
        if (!dir.delete()) {
            throw new Exception("Failed to delete directory: " + path);
        }
        System.out.println("Directory deleted: " + path);
    }
}

// 3. Proxy (Controls access based on user role)
class DirectoryServiceProxy implements DirectoryService {
    private RealDirectoryService realService;
    private String userRole; // "admin" or "user"

    public DirectoryServiceProxy(String userRole) {
        this.realService = new RealDirectoryService();
        this.userRole = userRole;
    }

    @Override
    public void createDirectory(String path) throws Exception {
        if (userRole.equals("admin") || userRole.equals("user")) {
            realService.createDirectory(path);
        } else {
            throw new Exception("Permission denied: Only Admin or User can create directories.");
        }
    }

    @Override
    public void renameDirectory(String oldPath, String newPath) throws Exception {
        if (userRole.equals("admin")) {
            realService.renameDirectory(oldPath, newPath);
        } else {
            throw new Exception("Permission denied: Only Admin can rename directories.");
        }
    }

    @Override
    public void deleteDirectory(String path) throws Exception {
        if (userRole.equals("admin")) {
            realService.deleteDirectory(path);
        } else {
            throw new Exception("Permission denied: Only Admin can delete directories.");
        }
    }
}

// 4. Demo Usage
public class Main {
    public static void main(String[] args) {
        try {
            // Admin user
            DirectoryService adminProxy = new DirectoryServiceProxy("admin");
            adminProxy.createDirectory("testDir");
            adminProxy.renameDirectory("testDir", "newTestDir");
            adminProxy.deleteDirectory("newTestDir");

            System.out.println("\n---\n");

            // Regular user
            DirectoryService userProxy = new DirectoryServiceProxy("user");
            userProxy.createDirectory("userDir"); // Allowed
            userProxy.renameDirectory("userDir", "newUserDir"); // Denied
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}