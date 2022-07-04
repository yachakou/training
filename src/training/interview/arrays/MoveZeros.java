package training.interview.arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int[] res = new int[nums.length];

        int index = 0;
        int cursor = 0;
        while (index < nums.length) {
            if (nums[index] != 0) {
                res[cursor] = nums[index];
                cursor++;
            }
            index++;

        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = res[i];
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(res));


    }

    public static void moveZeroes2(int[] nums) {
        int index = 0;

        int left = 0;
        int right = 0;
        int temp;
        while (right < nums.length) {
            if (nums[right] == 0) {
                right++;
            } else {
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right++;
            }
        }

        System.out.println(Arrays.toString(nums));


    }

}