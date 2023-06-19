public class CountSetBits {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;

        while (n > 0) {
            if ((n & 1) == 1) {  // Check if the least significant bit is set (equals 1)
                count++;
            }
            n >>= 1;  // Right-shift n by 1 to examine the next bit
        }

        System.out.println(count);
    }
}


