public class Reverse_Array {
    static int[] reverse(int []a){
        int n= a.length-1;
//        for(int i=0;i<(a.length)/2;i++){
//            int temp = a[i];
//            a[i] = a[n - i - 1];
//            a[n - i - 1] = temp;
//        }
        int i=0;
        while(i<n){
            int temp=a[i];
            a[i]=a[n];
            a[n]=temp;
            i++;
            n--;
        }
        return a;
    }

    public static void main(String[] args) {
        int []ar={1,2,3,4,5};
        reverse(ar);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+ " ");
        }


    }
}
