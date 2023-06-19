
import java.util.Arrays;
import java.util.Scanner;

public class JAVA {
    public static void main(String[] args) {
//        System.out.println("Enter the name");
//        Scanner sc=new Scanner(System.in);
//        String naam=sc.next();
//        String mess=greet(naam);
//        System.out.println(mess);
//        int[] arr={10,20,25,222,11};
//        change(arr);
        fun(10,20,222,1211);
        fun2(2,"AMAN",20,52,21,23,14);

    }


    //    static String greet(String naame){
//        String messaage="How are you"+naame;
//        return messaage;
//    }
//    static void change(int[] nums){
//        nums[0]=77;
//        System.out.print(Arrays.toString(nums));
//    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun2(int a,String name,int...v1){
        System.out.println(Arrays.toString(v1));
    }




}