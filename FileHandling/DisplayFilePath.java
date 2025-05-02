package FileHandling;
import java.io.File;
import java.io.IOException;

public class DisplayFilePath {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");

            if (file.exists()) {
                System.out.println("File Path: " + file.getAbsolutePath());
            } else {
                System.out.println("File does not exist.");
            }
        } catch (Exception e) { // Using Exception to match the same format
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}