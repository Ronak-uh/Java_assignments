import java.util.Scanner;

public class UserSimpleInterest 
{
    public static void main(String[] args)
     {
        Scanner obj_1=new Scanner(System.in);
        double principal;
        double rate;
        double time; 
        System.out.println("Enter the principle");
        principal=obj_1.nextDouble();
        System.out.println("Enter the rate");
        rate=obj_1.nextDouble();
        System.out.println("Enter the time");
        time=obj_1.nextDouble();
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest: " + simpleInterest);
        obj_1.close();
    }

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}
