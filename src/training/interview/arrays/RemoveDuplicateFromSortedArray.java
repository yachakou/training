package training.interview.arrays;

public class RemoveDuplicateFromSortedArray {


    // Using extra memory space
    public static int removeDuplicates(int[] nums) {
        int[] result = new int[nums.length];

        int index = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int current = nums[i];
            int next = nums[i + 1];
            if (current != next) {
                result[index++] = current;
            }
        }

        result[index++] = nums[nums.length - 1];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }

        return index;
    }

    // Using no extra memory space
    public static int removeDuplicates2(int[] nums) {

        int index = 0;

        return index;
    }
}
