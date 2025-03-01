import java.io.*;
public class trycatc{
    public static void main(String[] args) {
        int n=10;
        int  m=0;

        try{
            int ans=n/m;
            System.out.println("Answer"+ans);


        }
        catch(ArithmeticException e){
            System.out.println("Error division by zero is not allowed ");
        }
        finally{
            System.out.println("Program continues after handling exception");
        }
    }
}