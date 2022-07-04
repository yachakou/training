package training.interview.arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] newRes = new int[digits.length + 1];
        newRes[0] = 1;

        return newRes;
    }
}
