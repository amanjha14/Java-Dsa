public class Kadane {
    public static void main(String[] args) {
        int[] arr = {-1, -2, -3, -4};
        int sol = kadanes(arr);
        System.out.println(sol);
    }

    static int kadanes(int[] arr) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];

            if (cs > ms) {
                ms = cs;
            }

            if (cs < 0) {
                cs = 0;
            }
        }
        return ms;
    }
}
