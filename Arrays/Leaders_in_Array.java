//Complexity is O(n)
public class Leaders_Array {
    static void leaders(int []a){
        int cur_ele=a[a.length-1];

        System.out.print(cur_ele+" ");
        for(int i= a.length-2;i>=0;i--){
            if(a[i]>cur_ele){
                cur_ele=a[i];
                System.out.print(cur_ele+" ");
            }
        }
    }

    public static void main(String[] args) {
        int []a={9,8,7,6,5,4,3,2,1};
        leaders(a);
    }
}


//other approach
//Complexity is O(n2)
//public class Leaders_Array {
//    static void leaders(int []a){
//        boolean flag=true;
//     for(int i=0;i<a.length;i++){
//         flag=true;
//         for(int j=i+1;j< a.length;j++){
//
//             if(a[j] >= a[i]){
//                 flag=false;
//                 break;
//             }
//         }
//         if(flag){
//             System.out.print(a[i]+" ");
//
//         }
//     }
//    }
//
//    public static void main(String[] args) {
//        int []a={8,2,5,6,4,3};
//        leaders(a);
//    }
//}
