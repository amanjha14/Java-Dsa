import java.util.Arrays;

public class Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {25, 58, 88, 78},
                {25, 588, 78, 77}
        };
        int[] ans = Muld(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] Muld(int[][] arr) {
        int max = arr[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                    maxRow = row;
                    maxCol = col;
                }
            }
        }

        if (maxRow == 0 && maxCol == 0) {
            return new int[]{-1, -1};
        } else {
            return new int[]{maxRow, maxCol};
        }
    }
}

