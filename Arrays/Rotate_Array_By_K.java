//Complexity is O(k*N)

import java.util.*;
public class Rotate_Array_By_K {
    static  int[] rotate_one(int[] arr, int size){
        int sr=arr[0];
        for(int i=1;i<size;i++){
            arr[i-1]=arr[i];
        }
        arr[size-1]=sr;
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"  "  );
        }

        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements in an Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of times a array to be rotated");
        System.out.println("If Entered positive value then it s anti or Counter clockwise, if negative value then it s Clockwise ");
        int k= sc.nextInt();
        k=k% arr.length;
        if(k<0){
            k=k+ arr.length;
        }
        for(int i=0;i<k;i++) {
            rotate_one(arr, size);
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
