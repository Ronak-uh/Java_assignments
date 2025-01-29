class continent
{
    public void display()
    {
        System.out.println("Asia");
    }
}

class country extends continent
{
    public void display1()
    {
        System.out.println("India");
    }
}

class state extends country
{
    public void display2()
    {
        System.out.println("Maharashtra");
    }
}

public class Location
{
    public static void main(String[] args)
    {
       state obj_1=new state();
       obj_1.display();
       obj_1.display1();
       obj_1.display2();
      
    }
}
