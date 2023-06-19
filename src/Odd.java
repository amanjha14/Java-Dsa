public class Odd {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896,8888,2542,547774};
        int number=OddDigit(arr);
        System.out.println(number);
    }
    static int OddDigit(int [] arr){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(isOdd(arr[i])){
                count++;
            }

        }

        return count;
    }
    static boolean isOdd(int num){
        int Odd=Digit(num);
        return Odd%2 != 0;
    }
    static int Digit(int num){
        if(num==0) return -1;
        if(num<0) return num*-1;
        int count =0;
        while (num>0){
            num=num/10;
            count++;

        }
        return count;

    }




}
