public class Main
{
	public static void main(String[] args) {
		int n=8;
		int k=4;
		int c=1<<(k-1);
		if((n & c) != 0){
		    System.out.println("Set");
		}
		else
		System.out.println("Not Set");
		
	}
}


//other approach using right shift
public class Main
{
	public static void main(String[] args) {
		int n=8;
		int k=4;
	int c=n>>k-1;
		if((c & 1) == 1){
		    System.out.println("Set");
		}
		else
		System.out.println("Not Set");
		
	}
}

