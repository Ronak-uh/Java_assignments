import java.util.Scanner;

public class UserSwapWithorWithout
{
    public static void swapWithTemp(int a, int b) {
        System.out.println("Before swap (with temp): a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap (with temp): a = " + a + ", b = " + b);
    }
    
    public static void swapWithoutTemp(int a, int b) {
        System.out.println("Before swap (without temp): a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap (without temp): a = " + a + ", b = " + b);
    }
    
    public static void main(String[] args) {
        Scanner obj_1= new Scanner(System.in);
        int x, y;
        System.out.println("Enter the two numbers");
        x=obj_1.nextInt();
        y=obj_1.nextInt();
        swapWithTemp(x, y);
        System.out.println();
        swapWithoutTemp(x, y);
    }
}
