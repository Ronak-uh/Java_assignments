import java.util.Scanner;

class NumberIsZeroException extends Exception {
    public NumberIsZeroException(String message) {
        super(message);
    }
}

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine(); 
            int number = Integer.parseInt(input); 

            if (number == 0) {
                throw new NumberIsZeroException("Number is Zero");
            }

            if (isPrime(number)) {
                System.out.println(number + " is a Prime Number.");
            } else {
                System.out.println(number + " is NOT a Prime Number.");
            }

        } catch (NumberIsZeroException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number is Invalid");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}