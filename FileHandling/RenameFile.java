package FileHandling;
import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File oldFile = new File("example.txt"); 
        File newFile = new File("renamed_file.txt");

        if (oldFile.exists()) {
            if (oldFile.renameTo(newFile)) {
                System.out.println("File renamed successfully to: " + newFile.getName());
            } else {
                System.out.println("File rename failed.");
            }
        } else {
            System.out.println("File not found. Make sure 'example.txt' exists.");
        }
    }
}