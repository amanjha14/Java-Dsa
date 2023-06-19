public class ArrayCount {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
        int sol = findOnce(arr);
        System.out.println(sol);
    }

    static int findOnce(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                return arr[i];
            }
        }
        return -1; // Return -1 when there is no element that occurs only once
    }
}
