package training.interview.strings;

public class ReverseString {

    public static void reverseString(char[] s) {
        internalReverseString(s, 0, s.length - 1);
    }

    private static char[] internalReverseString(char[] s, int firstIndex, int lastIndex) {
        if (firstIndex == s.length / 2) {
            return s;
        }
        char temp = s[firstIndex];
        s[firstIndex] = s[lastIndex];
        s[lastIndex] = temp;
        return internalReverseString(s, firstIndex + 1, lastIndex - 1);
    }
}



