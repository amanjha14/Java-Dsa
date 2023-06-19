public class Count {
    public static void main(String[] args) {
        int[] arr = {5, 20, 66, 1314};
        int sol = countNegativeElements(arr);
        System.out.println(sol);
    }

    static int countNegativeElements(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
            else{
                count++;
            }
        }
        return count;
    }
}
