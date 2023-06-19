

import java.util.Scanner;

public class Plainderome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

//        boolean ans=fun(n);
//        System.out.println(ans);


        for(int i=10;i<n;i++){
            if(fun(i)){
                System.out.println(i+" ");

            }
        }
    }


    static boolean  fun(int n) {
        int original= n;
        int sum=0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum*10+ rem;
            n = n / 10;

        }
return (original==sum);
    }



}
