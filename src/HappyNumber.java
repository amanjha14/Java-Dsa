public class HappyNumber {
    public static void main(String[] args) {
        int num = 19;
        boolean isHappy = isHappy(num);
        System.out.println(isHappy);
    }

    static boolean isHappy(int num) {
        int slow = num;
        int fast = num;

        do {
            slow = calculateSumOfSquares(slow);
            fast = calculateSumOfSquares(calculateSumOfSquares(fast));
        } while (slow != fast);

        return slow == 1;
    }

    static int calculateSumOfSquares(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }

        return sum;
    }
}
