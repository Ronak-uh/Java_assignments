import java.util.Scanner;

public class UserCheckNo
{


    public static void checkNumber(int number)
  {
    if (number > 0)
     {
        System.out.println(number + " is positive.");
     } else if (number < 0)
      {
        System.out.println(number + " is negative.");
      } else 
      {
        System.out.println(number + " is zero.");
      }
  }
    
public static void main(String[] args) 
{
    Scanner obj_1=new Scanner(System.in);
    int x;
    System.out.println("Enter the number to check");
    x=obj_1.nextInt();
    UserCheckNo.checkNumber(x);
    obj_1.close();
}

}
