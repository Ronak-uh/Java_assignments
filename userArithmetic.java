import java.util.Scanner;
class userArithmetic
{
    public static void main(String[] args)
    {
        Scanner cal = new Scanner(System.in);
        float x;
        float y;
        System.out.println("Enter the values for x and y");
        x = cal.nextFloat();
        y = cal.nextFloat();
        {
            System.out.println("Sum: "+ (x+y));
        }
        {
            System.out.println("Difference: "+ (x-y));
        }
        {
            System.out.println("Multiplication: "+ (x*y));
        }
        {
            System.out.println("Division: "+ (x/y));
        }
        cal.close();
}
}

