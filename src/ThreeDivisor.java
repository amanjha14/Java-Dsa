public class ThreeDivisor {
    public static void main(String[] args) {
        int n = 12;
        boolean ans = isThree(n);
        System.out.println(ans);
    }

    static boolean isThree(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }
}
