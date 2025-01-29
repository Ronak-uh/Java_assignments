import java.util.Scanner;

class Main 
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner (System.in);
        String userName;
        // Enter the username and press enter
        System.out.println("Enter the username");
        userName = myObj.nextLine();
        System.out.println("Username is "+ userName);
        myObj.close();
    }
}

