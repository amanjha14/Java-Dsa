import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        int power;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        power=(int)Math.log10(num);

        int lastdigit=num%10;
        int firstdigit=(int)(num/Math.pow(10,power));

        int a=firstdigit*(int)Math.pow(10,power);

        int b=num%a;
        num=b/10;
        System.out.println(num);

        num=(lastdigit*(int) Math.pow(10,power))+num*10+firstdigit;
        System.out.println(num);
    }
}
