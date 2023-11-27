public class PowerFunctionExample {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;

        int result = power(base, exponent);

        System.out.println(base + " ^ " + exponent + " = " + result);
    }

    // Power calculation without recursion
    public static int power(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent should be a non-negative integer");
        }

        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }
}
