public class Diagonal {
    public static void main(String[] args) {
        int[][] Matrix={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum=Matrix(Matrix);
        System.out.println(sum);
    }
    static int Matrix(int[][] Matrix){
        int sum=0;
        for(int i=0;i<Matrix.length;i++){
            sum+=Matrix[i][i];
            if(i!=Matrix.length-1-i){
                sum+=Matrix[i][Matrix.length-i-1];
            }
        }
        return sum;
    }
}
