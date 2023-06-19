//public class Binary {
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 54, 55, 85, 101, 112, 210,17,19,3};
//        int nom = prime(arr);
//        System.out.println(nom);
//    }
//
//    static int prime(int[] arr) {
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (isprime(arr[i]))
//                count++;
//        }
//        return count;
//    }
//
//    static boolean isprime(int num) {
//        //int DigitNumber = Digit(num);
//        for (int j = 2; j < num; j++) {
//            if (num % j == 0)
//                return false;
//        }
//        return true;
//    }

//    static int Digit(int num) {
//        if (num == 0)
//            return 0;
//        if (num <= 1)
//            return 0;
//        int count = 0;
//        while (num > 0) {
//            num /= 10;
//            count++;
//        }
//        return count;
//    }
//
//
//Binary search
public class Binary {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'e';
        char result = nextGreatestLetter(letters, target);
        System.out.println(result);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[2];
    }
}



