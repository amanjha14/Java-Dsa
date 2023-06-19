import java.util.Arrays;

public class DupArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1};
        int count = Dup(arr, 2);
        System.out.println(count);

    }

     static int Dup(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) count++;
            }
        }
        return count;
    }
}


//    static  int Dup(int[] nums) {
//        if (nums.length == 0) {
//            return 0;
//        }
//
//        int newIndex = 1;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != nums[i - 1]) {
//                nums[newIndex] = nums[i];
//                newIndex++;
//            }
//        }
//
//        return newIndex;
//    }
//
//}
//class Solution {
//    public int countPairs(int[] nums, int k) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (Math.abs(nums[i] - nums[j]) == k) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//}


