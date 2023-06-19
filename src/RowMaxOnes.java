public class RowMaxOnes {
    public static void main(String[] args) {
        int[][] arr = {
                        {0 ,1, 1, 1},
                        {0 ,0 ,1 ,1},
                        {1,1, 1, 1}
        };

        int rowWithMaxOnes = MaxOnes(arr);
        System.out.println("Row with the maximum number of ones: " + rowWithMaxOnes);
    }

    static int MaxOnes(int[][] arr) {
        int maxOnes = 0;
        int rowWithMaxOnes = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }

            if (count > maxOnes) {
                maxOnes = count;
                rowWithMaxOnes = i-1;
            }
        }

        return rowWithMaxOnes;
    }
}

