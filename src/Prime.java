import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans=fun1(n);
        System.out.println(ans);
//        for(int i=2;i<n;i++){
//            if (fun1(i)){
//                System.out.println(i+" ");
//            }
//        }
    }
    static boolean fun1(int n){
        int c=2;
        if(n<=1){
            return false;
        }
        while(c<n){
           if(n%c==0){
               return false;
           }
           return true;
        }
        return c*c >= n;

    }
}
