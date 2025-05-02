package FileHandling;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileReadWrite{
    public static void main(String[] args){
        String inputFile = "example.txt";
        String outputFile = "output.txt";

        try(FileReader reader = new FileReader(inputFile);
            FileWriter writer = new FileWriter(outputFile)){
            int character;
            while((character = reader.read()) != -1){
                writer.write(character);
            }

        }catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
