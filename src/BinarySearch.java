class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5};
        int target = 5;
        int sol = search(arr, target);
        System.out.println(sol);
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid; // Target found at mid index
            } else if (target < nums[mid]) {
                end = mid - 1; // Target is in the left half
            } else {
                start = mid + 1; // Target is in the right half
            }
        }

        return -1; // Target not found
    }
}
