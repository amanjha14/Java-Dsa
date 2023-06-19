public class LinearString {
    public static void main(String[] args) {
        String[] arr = {"Aman", "Abi", "Panda", "Dhoni"};
        String ans = fun(arr, "aaa");
        System.out.println(ans);
    }

    static String fun(String[] arr, String naam) {
        if (arr.length == 0) {
            return "ZERO";
        }
        for (int i = 0; i < arr.length; i++) {
            String element = arr[i];
            if (element.equals(naam)) {
                return element;
            }
        }
        return "Zero";
    }
}
