class parent_1 
{
    void showparent1()
    {
        System.out.println("This is parent 1");
    }
}

class parent_2 extends parent_1
{
    void showparent2()
    {
        System.out.println("This is parent 2");
    }
}

class child extends parent_2
{
  
}

public class Inheritance_multilevel
{
    public static void main(String[] args)
    {
       child obj=new child();
       obj.showparent1();
       obj.showparent2();
    }


}

