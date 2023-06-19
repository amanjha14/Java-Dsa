public class Stock {
    public static void main(String[] args) {
        int[] arr={7,1,3,5,6,4};
        int sol=BuyStock(arr);
        System.out.println(sol);

    }
    static int BuyStock(int[] arr){
        int Buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        int profit=0;
        for(int i=0;i<arr.length;i++){
            if(Buyprice < arr[i]) {
               profit = arr[i] - Buyprice;
                maxprofit=Math.max(profit,maxprofit);

            }
            else{
                Buyprice=arr[i];
            }
        }
        return maxprofit;
    }
}
