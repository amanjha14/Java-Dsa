public class PrimeCount {
    public static void main(String[] args) {
        int n = 10;
        int sol = countPrimes(n);
        System.out.println(sol);
    }

    static int countPrimes(int n) {
        if (n <= 1) return 0;  // Corrected condition

        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}
