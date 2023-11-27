public class Main
{
public static int gcd(int a, int b) {
    if (b == 0) {
        return a;
    } else {
        return gcd(b, a % b);
    }
}


  
	public static void main(String[] args) {
        int x=6;
        int y=8;
		System.out.println(gcd(x,y));
	}
}
