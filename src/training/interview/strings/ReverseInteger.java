package training.interview.strings;

public class ReverseInteger {


    public static int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }
        long result = 0;
        int number = x;
        while (number > 0) {
            result = result * 10 + number % 10;
            number /= 10;
        }

        if (result > Integer.MAX_VALUE)
            return 0;
        return (int) (isNegative ? -result : result);
    }
}