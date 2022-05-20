package training.interview.arrays;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int length = nums.length;

        k = k % length;
        rotate(0, length - k - 1, nums);
        rotate(length - k, length - 1, nums);
        rotate(0, length - 1, nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void rotate(int start, int end, int[] nums) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
