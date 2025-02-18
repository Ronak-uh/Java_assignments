class A
{
    public void add(int a , int b)
    {
      System.out.println((a+b));
    }
}

class B extends A
{
    @Override
    public void add(int a, int b)
   {
    System.out.println("nuh uh "+(a+b));
   }
}

public class Overriding
{
    public static void main(String[] args)
    {
     B obj_1=new B();
     obj_1.add(20,30);
    }
}