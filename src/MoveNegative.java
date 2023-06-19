//public class MoveNegative {
//    public static void main(String[] args) {
//        int[] arr={-1,2,5,-3,8,9};
//        System.out.println(Matrix(arr));
//    }
//    public class MoveNegative {
//        public static void main(String[] args) {
//            int[] arr = {-1, 2, 5, -3, 8, 9};
//            moveNegative(arr);
//            System.out.println("The array after moving negatives:");
//            for (int num : arr) {
//                System.out.print(num + " ");
//            }
//        }
//
//        static void moveNegative(int[] arr) {
//            int left = 0;
//            int right = arr.length - 1;
//            while (left < right) {
//                while (left < right && arr[left] < 0) {
//                }
//                while (left < right && arr[right] >= 0) {
//                    right--;
//                }
//                if (left < right) {
//                    int temp = arr[left];
//                    arr[left] = arr[right];
//                    arr[right] = temp;
//                }
//            }
//        }
//    }               left++;
//
//
