package training.algorithms.strings;

public class ReversStringWithoutAffectingSpecialChar {

    public static void main(String[] args) {
        String special = "a,b$c";
        String special2 = "vfg+plsd-/mnc,";

        System.out.println("Original string " + special);
        System.out.println("Reversed without changing special character " + reverseWithoutCHangingSpecialChars(special));

        System.out.println("Original string " + special2);
        System.out.println("Reversed without changing special character 2 " + reverseWithoutChangingSpecialCharsSecondMethod(special2));

    }

    public static String reverseWithoutCHangingSpecialChars(String special) {

        char[] original = special.toCharArray();
        char[] reversed = new StringBuilder(special).reverse().toString().toCharArray();

        for (int i = 0; i < original.length; i++) {
            if (!Character.isAlphabetic((original[i]))) {
                reversed[i] = original[i];
            }
        }

        return String.valueOf(reversed);
    }

    public static String reverseWithoutChangingSpecialCharsSecondMethod(String special) {
        char[] chars = special.toCharArray();
        int l = 0, r = chars.length - 1;

        while (l < r) {
            if (!Character.isAlphabetic(chars[l])) {
                l++;
            } else if (!Character.isAlphabetic(chars[r])) {
                r--;
            } else {
                char aChar = chars[l];
                chars[l] = chars[r];
                chars[r] = aChar;
                l++;
                r--;
            }
        }
        return String.valueOf(chars);
    }


}
