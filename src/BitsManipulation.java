public class BitsManipulation {
//    public static void main(String[] args) {
//        System.out.println();
//    }
public static void main(String[] args) {
    OddAndEven(564666461);
    System.out.println(~5);
}
static void OddAndEven(int n){
    int bitmask=1;
    if((n & bitmask)==0){
        System.out.println("even");
    }
    else{
        System.out.println("odd");
    }
}
}
