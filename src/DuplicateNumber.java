public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 8, 2, 4};
        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] arr) {
        int duplicate = 0;
        for (int num : arr) {
            duplicate ^= num;
        }
        return duplicate;
    }
}


