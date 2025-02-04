import java.util.Scanner;

class userCons {
    userCons(Scanner obj_1) {  
        System.out.print("Enter an integer: ");
        
        if (obj_1.hasNextInt()) {  // Check if the input is an integer
            int x = obj_1.nextInt();
            System.out.println("x: " + x);
        } else {
            System.out.println("Invalid input! Please enter an integer.");
        }
    }

    public static void main(String[] args) {
        Scanner obj_1 = new Scanner(System.in);
        new userCons(obj_1);
        obj_1.close();
    }
}