public class FactorialExample {
    public static void main(String[] args) {
        int number = 5;

        int result = factorial(number);

        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
