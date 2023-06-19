import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.println("Enter the degree");
        Scanner sc=new Scanner(System.in);
        int celcius=sc.nextInt();
        double  farenheit=(int)(celcius*1.8)+32;
        double kelvin=celcius+273.15;
        System.out.println("The value of "+celcius+"in farenheit is "+farenheit);
        System.out.println("The value of "+celcius+"in kelvin is "+kelvin);
    }
}
