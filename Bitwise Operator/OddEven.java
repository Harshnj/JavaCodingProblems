public class OddorEvenBitwiseOperaor {
    static String OddEven(int num){
      if((num & 1)==1){
          return "Odd";
        }
        else
            return "Even";
    }

    public static void main(String[] args) {
        int num=20;
        System.out.println("The number "+num+" is "+OddEven(num));
    }
}
