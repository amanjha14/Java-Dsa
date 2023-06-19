import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={10,20,233,252,1111,25251};
        rev(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void rev(int[] arr){
        int start=0;
        int end= arr.length-1;
        while (start<end){
            swap1(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap1(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }

}
