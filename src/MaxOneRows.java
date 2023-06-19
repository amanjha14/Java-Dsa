public class MaxOneRows {
    public static void main(String[] args) {
        // Test the matrix method
        int[][] arr = {
                {0, 1, 0, 1, 1},
                {1, 0, 1, 0, 0},
                {0, 1, 1, 1, 0},
                {1, 1, 0, 0, 1}
        };
        int maxOnes = matrix(arr);
        System.out.println("Max number of 1's in a row: " + maxOnes);
    }

    static int matrix(int[][] arr) {
        int maxOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxOnes) {
                maxOnes = count;
            }
        }
        return maxOnes;
    }
}

