package training.interview.strings;

public class Strstr {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty())
            return 0;

        if (haystack.length() < needle.length())
            return -1;

        int res = -1;

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int remaining = needle.length();
                if (haystack.length() - i >= remaining) {
                    int pos = 1, j = i + 1;
                    res = i;

                    while (j < haystack.length() && pos < needle.length() && haystack.charAt(j) == needle.charAt(pos)) {
                        pos += 1;
                        j += 1;
                    }

                    if (pos == needle.length())
                        return res;

                    else {
                        res = -1;
                    }
                }
            }
        }
        return res;
    }

    public  static int strStr2(String haystack, String needle) {
        for (int i = 0; ; i++) { // The length of haystack
            for (int j = 0; ; j++) { // The length of needle
                if (j == needle.length()) return i; // If at this point we have navigated through the entire length of needle, we have found a solution, haystack[i].
                if (i + j == haystack.length()) return -1; // This happens when we run out of elements in haystack, but there are still elements in needle.
                if (needle.charAt(j) != haystack.charAt(i + j)) break; // We stop comparing after needle[j], so i will be incremented and cycle repeats itself.
            }
        }
    }

}
