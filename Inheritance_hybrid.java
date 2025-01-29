class a
{
    public void display()
    {
        System.out.println("Base Class");
    }
}

class b extends a
{
   public void display1()
   {
    System.out.println("Derived Class");
   }
}

class c extends b
{
    public void display2()
    {
        System.out.println("C Derived Class");
    }
}

class d extends b
{
    public void display3()
    {
        System.out.println("D Derived Class");
    }
}

public class Inheritance_hybrid
{
   public static void main(String[] args)
   {
     d obj_1=new d();
     obj_1.display();
     obj_1.display1();
     obj_1.display3();

     c obj_2=new c();
     obj_2.display2();

   }
}