public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] arr={0,0,1,};
        int sol=Array(arr);
        System.out.println(sol);
    }
    static int Array(int[] arr){
        int count =0;;
        for(int i=0;i<arr.length;i++){
            if(i< arr.length-1 && arr[i]==arr[i+1]){
                continue;
            }
            else{
                arr[count]=arr[i];
                count ++;

            }
        }
        return count;

    }
}
