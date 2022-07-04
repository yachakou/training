package training.interview.strings;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";

        if (strs.length == 1)
            return strs[0];

        String firstWords = strs[0];


        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < firstWords.length(); i++) {
            char possiblePrefix = firstWords.charAt(i);
            boolean isPrefixValid = true;
            for (int j = 1; j < strs.length; j++) {
                if (i < strs[j].length()) {
                    char c = strs[j].charAt(i);
                    if (c != possiblePrefix) {
                        isPrefixValid = false;
                        break;
                    }
                } else {
                    isPrefixValid = false;
                    break;
                }
            }
            if (isPrefixValid)
                prefix.append(possiblePrefix);
            else
                break;
        }
        return prefix.toString();
    }

    public static String longestCommonPrefix2(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            prefix = getCommonPrefix(prefix, strs[i]);
        }

        return prefix;
    }

    private static String getCommonPrefix(String prefix, String str) {
        int p1 = prefix.length();
        int p2 = str.length();
        StringBuilder res = new StringBuilder();
        for (int i = 0, j = 0; i <= p1 - 1 && j <= p2 - 1; i++, j++) {
            if (prefix.charAt(i) != str.charAt(j))
                break;
            res.append(prefix.charAt(i));
        }

        return res.toString();
    }
}
