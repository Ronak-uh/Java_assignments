
class A
{
    public static void add(int a , int b)
    {
      System.out.println((a+b));
    }
}

class B extends A
{
   public static void add(int a, int b, int c)
   {
    System.out.println((a+b+c));
   }
}


public class Overloading
{
    public static void main(String[] args)
    {
     B.add(20,30);
     B.add(30,40,50);

    }
}