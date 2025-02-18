public class Method_1 {
    
    public void greetUser() 
    {
        System.out.println("Hello, Welcome to Java!");
    }

    public void displayMessage(String name) 
    {
        System.out.println("Hello, " + name + "! Hope you're doing great.");
    }

    public static void main(String[] args) 
    {
        Method_1 obj = new Method_1();
        obj.greetUser();
        obj.displayMessage("Sourabh");
    }
}