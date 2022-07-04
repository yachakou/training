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

    public static int[] rotate2(int[] A, int K) {

        int size = A.length;

        if (size <= 1)
            return A;

        int rotation = K % size;

        if (rotation == 0)
            return A;

        int countRotation = 0;

        while (countRotation < rotation) {
            int temp = A[size - 1];
            for (int i = size - 1; i > 0; i--) {
                A[i] = A[i - 1];
            }
            A[0] = temp;

            countRotation++;
        }
        System.out.println(Arrays.toString(A));

        return A;
    }
}
