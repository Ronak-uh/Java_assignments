class person 
{
    person()
    {
        System.out.println("Im Person");
    }

    person(String a)
    {
        System.out.println("Im "+a+" person");
    }
}

class address extends person
{
    address()
    {
       super("2nd");
        System.out.println("Address : Akshay chs sector 21 kharghar navi mumbai");
    }
}

 class phonenumber extends address
{
    phonenumber()
    {
       super();
        System.out.println("Phone Number : " + 1234567890);
    }
}

public class Main_1
{
    public static void main(String[] args)
    {
       new phonenumber();
    }
}