public class largestnum {

    public static int findLargest(int a, int b, int c) {
        int largest = a;
        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }
        return largest;
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        int c = 10;
        int largest = findLargest(a, b, c);
        System.out.println("The largest number among " + a + ", " + b + ", and " + c + " is: " + largest);
    }
}