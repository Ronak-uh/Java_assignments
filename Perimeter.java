public class Perimeter {
    public static int calculatePerimeter(int length, int width) {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        int length = 5;
        int width = 3;
        int perimeter = calculatePerimeter(length, width);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}