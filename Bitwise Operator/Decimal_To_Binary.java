public class Conversion_Decimal_Base {
    public String Conversion(int num) {
        int[] val = new int[12];
        int i = 0;

        while (num > 0) {
            val[i] = num % 2;
            i++;
            num /= 2;
        }

        // Convert the array to a binary string
        StringBuilder binaryStr = new StringBuilder();
        for (int j = i - 1; j >= 0; j--) {
            binaryStr.append(val[j]);
        }

        return binaryStr.toString();
    }

    public static void main(String[] args) {
        Conversion_Decimal_Base obj1 = new Conversion_Decimal_Base();
        String binary = obj1.Conversion(25);
        System.out.println(binary);
    }
}
