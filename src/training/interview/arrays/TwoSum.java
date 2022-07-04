package training.interview.arrays;

//https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/546/
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int expected = target - nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == expected) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}