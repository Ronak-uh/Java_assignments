class Person
{
    private String name;
    private int age;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
}

public class Main_2
{
    public static void main(String[] agrs)
    {
        Person p=new Person();
        p.setName("Sourabh");
        p.setAge(18);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}