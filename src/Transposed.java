public class Transposed {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {5, 9, 6}, {5, 8, 7}};
        int[][] transposedMatrix = transpose(matrix);
        printMatrix(transposedMatrix);
        System.out.println(matrix.length);
    }

    static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
