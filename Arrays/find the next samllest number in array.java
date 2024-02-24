
public class Main
{
	public static void main(String[] args) {
		 int arr[] = {0, 1, 2, 3,4,5,9}; 
		 int n=arr.length-1;
		  if(arr[0] >= 1){
		         System.out.println(0);
		      return;
		     }
		     int i=0;
		 for( i=0;i<arr.length-1;i++){
		    
		  if(arr[i+1] != arr[i]+1){
		      System.out.println(arr[i]+1);
		      return;
		  }
		 
		 }
		  if(i ==n ){
		       System.out.println(arr[n]+1);
		      return;
		  }
	}
}
