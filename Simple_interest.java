

public class Simple_interest {
    public static void main(String[] args) {
        double principal = 1000; // Principal amount
        double rate = 5; // Interest rate
        double time = 3; // Time period in years

        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest: " + simpleInterest);
    }

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void callCalculateSimpleInterest() {
        double principal = 2000; // Another principal amount
        double rate = 4; // Another interest rate
        double time = 2; // Another time period in years

        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest for another set of values: " + simpleInterest);
    }
}