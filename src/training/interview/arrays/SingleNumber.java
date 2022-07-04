package training.interview.arrays;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    count++;
                }
            }
            if (count < 2)
                return nums[i];
        }
        return 0;
    }

    public static int singleNumberBitManipulation(int[] A) {
        int x = 0;
        for (int a : A) {
            x = x ^ a;
        }
        return x;
    }

}
