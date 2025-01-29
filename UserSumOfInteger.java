import java.util.Scanner;

public class UserSumOfInteger 

{
    public static int sumUsingFor(int n) 
    {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
   
    
    public static void main(String[] args)
     {
        Scanner obj_1=new Scanner(System.in);
        int number;
        System.out.println("Enter the number");
        number=obj_1.nextInt();
        System.out.println("Sum using for loop: " + sumUsingFor(number));
     
    }
}