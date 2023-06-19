public class SearchRange {
    public static void main(String[] args) {
        int[] arr={10,20,35,55,78,222,200};
        int lin=Linear(arr,200,1,5);
        System.out.println(lin);
    }

      static int Linear(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<end;i++){
            int element = arr[i];
            if(element==target){
                return element;
            }
        }
        return -1;
    }
}
