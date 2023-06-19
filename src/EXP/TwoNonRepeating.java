import java.util.Arrays;

public class TwoNonRepeating {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4};
        int[] result = findNonRepeating(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] findNonRepeating(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                return new int[]{arr[i], arr[i + 1]};
            }
        }
        // If no non-repeating elements found
        return new int[]{-1, -1};
    }
}
