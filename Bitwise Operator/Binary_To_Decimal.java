import static java.lang.Math.pow;

public class BaseToDecimal {
    int BaseToDecimal(int num){
           int value=0;
           int ct=0;
           while(num > 0){
               double a=num %10;
               a = a * pow(2,ct);
               value = value+(int)a;
               num /= 10;
               ct++;
           }
           return value;

    }

    public static void main(String[] args) {
        BaseToDecimal ob1 = new BaseToDecimal();
        System.out.println(ob1.BaseToDecimal(111111));
    }
}
