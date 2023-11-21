public class Remove_Duplicate_Sorted_Array {

    static int remove_duplicate(int[] arr){
        int rd=0;
        for(int i=1;i< arr.length-1;i++) {
        if(arr[rd]!=arr[i]){
            rd++;
            arr[rd]=arr[i];
        }

        }
        return rd+1;

    }

    public static void main(String[] args) {
        int arr[]={1,2,2,3,5,5,6,9,9};
        int k=remove_duplicate(arr);
        for(int i=0;i< k;i++) {

            System.out.print(arr[i]+ " ");
        }

    }
}
