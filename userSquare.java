import java.util.Scanner;

class userSquare
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        
        System.out.println(x + "^2 = " + (x*x));
        
        sc.close();
    }
}