package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class readfile 
{
    public static void main(String[] args) 
    {
        try
        {
            File file = new File("example.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) 
            {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
