class A 
{
    int a;

    A(int a)
    {
        this.a=a;
    }
}

class B extends A
{
    int b;

    B(int a,int b)
    {
        super(a);
        this.b=b;
    }
}

class ConsChainAdd extends B
{
    int c;

    ConsChainAdd(int a, int b, int c)
    {
        super(a,b);
        this.c=c;
    }

    int sum()
    {
        return a+b+c;
    }

    public static void main(String[] args)
    {
        ConsChainAdd result=new ConsChainAdd(10, 20, 30);
        System.out.println("Sum:"+ result.sum());
    }
}