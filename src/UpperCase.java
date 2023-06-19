public class UpperCase {
    public static void main(String[] args) {
        String str = "hello world";
        String sol = Upper(str);
        System.out.println(sol);
    }

    static String Upper(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i-1) == ' ' && i < str.length()) {
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
}
