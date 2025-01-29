import java.util.Scanner;

class userSwapwithout
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();
        
        System.out.print("Enter value for b: ");
        int b = sc.nextInt();
        
        int temp;
        System.out.println("Before swap -> a: "+a+"  b: "+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap  -> a: "+a+"  b: "+b);
        
        sc.close();
    }
}
