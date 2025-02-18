abstract class Geeks
{
    abstract void turnOn();
    abstract void turnOff();
}

class TVremote extends Geeks
{
    public void turnOn()
    {
        System.out.println("TV is turned on");
    }

    public void turnOff()
    {
        System.out.println("TV is turned off");
    }
}

class Abstract_1
{
    public static void main(String[] args)
    {
        TVremote obj_1=new TVremote();
        obj_1.turnOn();
        obj_1.turnOff();

    }
}
