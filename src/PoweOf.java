public class PoweOf {
    public static void main(String[] args) {
        int num=16;
//        Boolean ans=Power(num);
        System.out.println(Power(num));
    }
    static boolean Power(int num){
        if(num==0){
            return false;
        }
        while(num!=1){
            if(num%4!=0){
                return false;
            }
            else{
                num=num/4;

            }

        }
        return true;
    }

}
