public class Second_Largest {
    static int second_largest(int []arr,int size){
        int lar1=0;
        int lar2=0;
        for(int i=0;i<size;i++){
            if(arr[i]> lar1){
                lar2=lar1;
                lar1=arr[i];

            }
        }
        return lar2;
    }
    public static void main(String[] args) {
        int arr[]={20,42,6,25,33,88};
        int a=second_largest(arr,arr.length);
        System.out.println(a);

    }
}
