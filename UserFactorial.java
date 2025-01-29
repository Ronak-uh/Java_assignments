import java.util.Scanner;

public class UserFactorial

{
    public static long factorialIterative(int n)
     {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args)
     {
        Scanner obj_1=new Scanner(System.in);
        int number;
        System.out.println("Enter the number");
        number=obj_1.nextInt();
        System.out.println("Iterative Factorial of " + number + " is: " + factorialIterative(number));
        obj_1.close();
    }
}
