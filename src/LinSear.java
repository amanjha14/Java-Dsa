import java.util.Arrays;

public class LinSear {
    public static void main(String[] args) {
        int[] arr={10,20,35,55,78};
        boolean lin=Linear2(arr,200);
        System.out.println(lin);
    }
    static boolean Linear2(int[] arr,int target){
        if(arr.length==0){
            return false;
        }
        for(int i=0;i<arr.length;i++){
//            int element = arr[i];
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
//    static int Linear(int[] arr,int target){
//        if(arr.length==0){
//            return -1;
//        }
//        for(int i=0;i<arr.length;i++){
//            int element = arr[i];
//            if(element==target){
//                return element;
//            }
//        }
//        return -1;
//    }

}
