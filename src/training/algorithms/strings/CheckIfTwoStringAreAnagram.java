package training.algorithms.strings;

import java.util.Arrays;

public class CheckIfTwoStringAreAnagram {
    public static void main(String[] args) {
        String s1 = "ber", s2 = "reb", s3 = "rob";
        isAnagram(s1, s2);
        isAnagram(s1, s3);
        isAnagram2(s1, s3);
        isAnagram2(s1, s2);
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            System.out.printf("The word %s and %s are not anagram \n", s1, s2);
            return false;
        }

        char[] chars1 = s1.toLowerCase().toCharArray();
        char[] chars2 = s2.toLowerCase().toCharArray();

        int length = chars1.length;
        for (int i = 0; i < length; i++) {
            if (chars1[i] != chars2[length - i - 1]) {
                System.out.printf("The word %s and %s are not anagram \n", s1, s2);
                return false;
            }
        }
        System.out.printf("The word %s and %s are anagram \n", s1, s2);
        return true;
    }

    public static boolean isAnagram2(String s1, String s2) {
        if (s1.length() != s2.length()) {
            System.out.printf("The word %s and %s are not anagram \n", s1, s2);
            return false;
        }

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        boolean result = Arrays.equals(chars1, chars2);

        if (result) {
            System.out.printf("The word %s and %s are anagram \n", s1, s2);
        } else {
            System.out.printf("The word %s and %s are not anagram \n", s1, s2);
        }
        return result;
    }
}
