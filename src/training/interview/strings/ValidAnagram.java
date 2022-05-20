package training.interview.strings;

import java.util.Arrays;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        int length = s.length();
        if (length != t.length())
            return false;


        int[] freq = new int[26];
        for (int i = 0; i < length; i++) {
            // charAt --> give the index of the character in the original string
            // - 'a' (the asci first value for the alphabet)
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        System.out.println(Arrays.toString(freq));
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0)
                return false;
        }
        return true;
    }

}
