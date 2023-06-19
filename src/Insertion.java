import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr={12,5,7,54,6};
        Insert(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Insert(int[] arr){
        for (int i=0;i< arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap( arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }



}
