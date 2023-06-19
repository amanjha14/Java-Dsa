import java.util.Arrays;

public class Basic {
//    public static void main(String[] args) {
//       int num=smallestEvenMultiple(37);
//        System.out.println(num);
//    }
//static int smallestEvenMultiple(int n) {
//        if((n & 1) == 0)
//            return n;
//        else
//            return 2*n;
//    }

        public static void main(String[] args) {
            int[] arr = {90, 100, 78, 89, 67,120};

            Arrays.sort(arr);
            int sol = findMedian(arr);
            System.out.println(sol);
        }

        static int findMedian(int[] arr) {
            int median;
            int middle = arr.length / 2;

            if (arr.length % 2 == 1) {
                median = arr[middle];
            } else {
                median = (arr[middle - 1] + arr[middle]) / 2;
            }

            return median;
        }
}

