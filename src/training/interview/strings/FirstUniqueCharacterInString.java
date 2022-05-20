package training.interview.strings;


import java.util.HashMap;

public class FirstUniqueCharacterInString {

    public static int firstUniqCharV2(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char letter : chars) {
            map.merge(letter, 1, Integer::sum);
        }

        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqChar(String s) {
        char[] chars = s.toCharArray();

        int index = -1;

        for (int i = 0; i < chars.length; i++) {
            char letter = chars[i];
            boolean isLetterRepeated = false;
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == letter && i != j) {
                    isLetterRepeated = true;
                    break;
                }
            }
            if (!isLetterRepeated) {
                index = i;
                break;
            }

        }
        return index;
    }
}
