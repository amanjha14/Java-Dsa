public class LargestString {
    public static void main(String[] args) {
        String[] str = {"mango", "apple", "grapes"};
        String largest = str[0];

        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > largest.length()) {
                largest = str[i];
            }
        }

        System.out.println(largest);
    }
}
