package training.interview.strings;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        String regex = "[^A-Za-z0-9]";

        String s1 = s.replaceAll(regex, "").toLowerCase();
        char[] chars = s1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] != chars[chars.length - i - 1]){
                return false;
            }
        }
        return true;
    }

}
