public class ReverseNumber {

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int num = 12345;
        int reversedNum = reverseNumber(num);
        System.out.println("Reversed Number: " + reversedNum);
    }
}