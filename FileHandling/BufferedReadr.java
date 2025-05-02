package FileHandling;

import java.io.*;
// import java.io.FileReader;
// import java.io.FileWriter;

public class BufferedReadr {
    public static void main(String[] args) {
        String filename = "BharathIsMaath.txt";
        FileReader FR = null;
        BufferedReader reader = null;
        try{
            FR = new FileReader(filename);
            reader = new BufferedReader(FR);
            String line;
            System.out.println("Reading From File : "+filename);
            System.out.println("File Content:\n");

            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            System.out.println("File has been read and written successfully!");
        }catch(IOException e){
            System.out.println("An Error Occured . ");
            e.printStackTrace();
        }
    }
}
