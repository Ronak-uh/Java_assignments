public class SumOfInteger {

    public static int sumOfIntegers(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 10;
        int sum = sumOfIntegers(num);
        System.out.println("Sum of integers up to " + num + " is: " + sum);
    }
}
