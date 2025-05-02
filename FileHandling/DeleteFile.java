package FileHandling;
import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");

            if (file.exists()) {
                if (file.delete()) {
                    System.out.println("File Deleted: " + file.getName());
                } else {
                    System.out.println("File deletion failed.");
                }
            } else {
                System.out.println("File does not exist.");
            }
        } catch (Exception e) { 
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}