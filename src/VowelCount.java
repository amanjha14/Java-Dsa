public class VowelCount {
    public static void main(String[] args) {
        String str = "Aman is good boy";
        int count = Vowel(str);
        System.out.println(count);
    }

    static int Vowel(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}
