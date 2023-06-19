import java.util.Arrays;

public class Kthlargest {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 8, 9, 7, 4};
        int[] result = kthLarge(arr, 3);
        System.out.println("K-th Smallest: " + result[0]);
        System.out.println("K-th Largest: " + result[1]);
    }

    static int[] kthLarge(int[] arr, int target) {
        Arrays.sort(arr);
        int[] result = new int[2];
        result[0] = arr[target - 1]; // k-th smallest
        result[1] = arr[target+1]; // k-th largest
        return result;
    }
}

