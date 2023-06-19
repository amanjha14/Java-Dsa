public class SquareArray {
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        Square(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void Square(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= arr[i];
        }
    }
}

