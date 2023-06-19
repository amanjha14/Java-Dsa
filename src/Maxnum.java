
public class Maxnum {
    public static void main(String[] args) {
    int[] arr={10,20,36,35,22};
    maxn(arr);
    }
    static void maxn(int[] arr){
        int max=arr[0];
        int i;

        for(i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
        System.out.println("the largest number in arr "+max);




    }

}
