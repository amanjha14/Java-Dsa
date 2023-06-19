import java.util.Scanner;

public class Sumof {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int sum=0;
        int rem;
        while(num!=0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;

        }
        System.out.println("The sum of given number is "+ sum);
    }
}
