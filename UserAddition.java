import java.util.Scanner;

public class UserAddition
{
    public void addition(int a, int b)
    {
        int a1,b1;
        a1=a;
        b1=b;

          int c;
          c=a1+b1;
          System.out.println(a+"+"+b+"="+c);
    }

    public static void main(String[] args)
    {
        Scanner obj_1=new Scanner(System.in);
        int x;
        int y;
        System.out.println("Enter the two numbers");
        x=obj_1.nextInt();
        y=obj_1.nextInt();

        UserAddition obj_2 = new UserAddition();
        obj_2.addition(x,y);
        obj_1.close();
    }
}

