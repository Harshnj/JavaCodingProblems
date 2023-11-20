//Complexity =O(n)
public class Rotate_Array_Optimised {
    static int[] reverse(int a[],int start,int end){
       while(start < end){
           int temp=a[start];
           a[start]=a[end];
           a[end]=temp;
           start++;
           end--;
       }
       return a;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int k=-5;
        k=k%a.length;
        if(k<0){
            k=k+a.length;//Clockwise
        }
        reverse(a,0,k-1);
        reverse(a,k,a.length-1);
        reverse(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
