import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int arr[]={10,20,3,25,55};
        Reverse(arr);

        System.out.println(Arrays.toString(arr));



    }
    static void Reverse(int[] arr){
        int start=0;
        int end=arr.length-1;

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
