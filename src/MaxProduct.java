public class MaxProduct {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 4, 5};
        int sol=maxProduct(arr);
        System.out.println(sol);
    }

    static int maxProduct(int[] arr) {
        int product;
        int total = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                product = 1; // Initialize product to 1
                for (int k = i; k <= j; k++) {
                    product *= arr[k]; // Calculate product of subarray elements
                }
                if (product > total) {
                    total = product; // Update maximum product if a higher product is found
                }
            }
        }
       return total; // Print the maximum product
    }
}
