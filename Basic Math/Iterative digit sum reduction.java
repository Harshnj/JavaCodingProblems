//The code repeatedly sums the digits of the given number until a single-digit result is obtained.
public class Main
{
	public static void main(String[] args) {
	int num=58;
	int res=0;
	boolean flag=false;
	while(num > 0){
	    res += num %10;
	    num /=10;
	    if(num ==0 && res>9 ){
	        num =res;
	        res=0;
	    }
	}
	System.out.println(res);
	}
}
