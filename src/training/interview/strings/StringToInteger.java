package training.interview.strings;

public class StringToInteger {

    public static int myAtoi(String s) {
        if (s.length() == 0) {
            return 0;
        }
        boolean isNgative = false;

        s = s.trim();

        if (s.isEmpty() || s.isBlank())
            return 0;

        int start = 0;
        if (s.charAt(0) == '-') {
            isNgative = true;
            start = 1;
        } else if (s.charAt(0) == '+') {
            start = 1;
        }

        if (start < s.length() && (s.charAt(start) < '0' || s.charAt(start) > '9'))
            return 0;

        int num = 0;
        for (int i = start; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10
                        && s.charAt(i) - '0' > 7))
                {
                   return isNgative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                } else  {
                    num = num * 10 + s.charAt(i) - '0';
                }

            } else
                break; //no longer a number

        }


        if (isNgative)
            num *= -1;

        return num;
    }
}
