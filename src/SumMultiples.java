public class SumMultiples {
    public static void main(String[] args) {
        int n = 10;
        int sum = Sum(n);
        System.out.println("Sum of multiples: " + sum);
    }

    static int Sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

