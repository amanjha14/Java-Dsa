public class DiagonalProduct {
    public static void main(String[] args) {
        int[][] nums={{1,2,3},{4,5,6},{7,8,9}};
        int sol=Matrix(nums);
        System.out.println(sol);
    }
    static int Matrix(int[][] nums){
        int prod=1;
        for(int i=0;i< nums.length;i++){
            prod*=nums[i][i];
            if(i!= nums.length-1-i){
                prod*=nums[i][nums.length-i-1];

            }
        }
        return prod;
    }

}
