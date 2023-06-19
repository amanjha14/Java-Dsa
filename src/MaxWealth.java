import java.util.Arrays;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr={
                {10,20,3},
                {2,5},
                {10,25,6}

        };
        int ans=maximumWealth(arr);
        System.out.println(ans);

    }
       static int maximumWealth(int[][] accounts) {
        int ans=0;
        for(int person=0;person<accounts.length;person++){
            int sum=0;
          for(int account=0;account<accounts[person].length;account++){
              sum+=accounts[person][account];
          }
          if(sum>ans){
              ans=sum;
          }

        }
        return ans;

    }
}
