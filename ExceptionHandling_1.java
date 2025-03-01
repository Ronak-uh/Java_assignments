class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}


public class ExceptionHandling_1 {

    
    public static void main(String[] args) {
        int age = 17;
        try {
            if (age < 18) {
                throw new AgeException("You are not eligible to vote");
            }
            else {
                System.out.println("You are eligible to vote");
            }
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}