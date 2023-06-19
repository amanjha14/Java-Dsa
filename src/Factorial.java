public class Factorial {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 4, 5,32};
        Fac(arr);
    }

    static void Fac(int[] arr) {
        int largest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        int factor = Fact(largest);
        System.out.println("Factorial of " + largest + ": " + factor);
    }

    static int Fact(int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

       return fact;
    }
}
