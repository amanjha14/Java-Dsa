public class Spiral {
    public static void main(String[] args) {
        int[][] Matrix={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Fun(Matrix);
    }

    static void Fun(int[][] Matrix){
        int startrow=0;
        int startcol=0;
        int EndRow=Matrix.length-1;
        int EndCol=Matrix[0].length-1;

        while (startrow <= EndRow && startcol <= EndCol){
            for (int j = startcol; j <= EndCol; j++){
                System.out.print(Matrix[startrow][j]+" ");
            }
            for (int i = startrow + 1; i <= EndRow; i++){
                System.out.print(Matrix[i][EndCol]+" ");
            }
            for (int j = EndCol - 1; j >= startcol; j--){
                if (startrow == EndRow){
                    break;
                }
                System.out.print(Matrix[EndRow][j]+" ");
            }
            for (int i = EndRow - 1; i > startrow; i--){
                if (startcol == EndCol){
                    break;
                }
                System.out.print(Matrix[i][startcol]+" ");
            }
            startrow++;
            startcol++;
            EndRow--;
            EndCol--;
        }
        System.out.println();
    }
}
