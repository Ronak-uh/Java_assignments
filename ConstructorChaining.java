class demo 
{
    demo()
    {
        System.out.println("Base Constructor");
    }

    demo(int a)
    {
        this();
        System.out.println(a);
    }
}

class ConstructorChaining extends demo
{
    ConstructorChaining(int a)
    {
        super(30);
    }

    public static void main(String[] args)
    {
        new ConstructorChaining(20);
    }
}