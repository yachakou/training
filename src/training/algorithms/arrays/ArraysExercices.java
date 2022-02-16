package training.algorithms.arrays;


import java.util.Arrays;

public class ArraysExercices {

    /**
     * Given a binary array nums, return the maximum number of consecutive 1's in the array.
     */
    static class MaxConsecutiveOnes {
        public int findMaxConsecutiveOnes(int[] nums) {
            int max = 0;
            int temp = 0;

            for (int num : nums) {
                if (num == 1) {
                    temp++;
                    if (temp > max) {
                        max = temp;
                    }
                } else {

                    temp = 0;

                }
            }
            return max;
        }
    }

    /**
     * Given an array nums of integers, return how many of them contain an even number of digits.
     */
    static class FindNumbersEvenNumberDigits {
        public int findNumbers(int[] nums) {
            int even = 0;
            for (int number : nums) {
                int lenght = 1;
                int op = number / 10;
                while (op > 0) {
                    lenght++;
                    op = op / 10;
                }

                if (lenght % 2 == 0) {
                    even++;
                }
            }
            return even;
        }
    }

    /**
     * Given an integer array nums sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     */
    static class SquaresSortedArray {
        public int[] sortedSquares(int[] nums) {
            int right = nums.length - 1, left = 0;
            int[] result = new int[nums.length];
            for (int i = nums.length - 1; i >= 0; i--) {
                if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                    result[i] = nums[left] * nums[left];
                    left++;
                } else {
                    result[i] = nums[right] * nums[right];
                    right--;
                }
            }
            return result;
        }
    }

    /**
     * Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to
     * the right.
     * <p>
     * Note that elements beyond the length of the original array are not written. Do the above modifications to
     * the input array in place and do not return anything.
     */
    static class DuplicateZeros {
        public static void duplicateZeros(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    System.out.println(" Before " + Arrays.toString(arr));

                    for (int y = arr.length - 1; y > i + 1; y--) {
                        arr[y] = arr[y - 1];
                    }
                    if (i + 1 < arr.length) {
                        arr[i + 1] = 0;
                        i = i + 1;
                    }
                    System.out.println(" After  " + Arrays.toString(arr));

                }
            }
        }
    }

    /**
     * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
     * representing the number of elements in nums1 and nums2 respectively.
     * <p>
     * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
     * <p>
     * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
     * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
     * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
     */
    static class MergeSortedArray {
        public static void merge(int[] nums1, int m, int[] nums2, int n) {

            for (int i = 0; i < n; i++) {
                for (int x = 0; x < nums1.length; x++) {
                    if (nums2[i] <= nums1[x]) {
                        // we inset here
                        for (int y = nums1.length - 1; y > x; y--) {
                            nums1[y] = nums1[y - 1];
                        }
                        nums1[x] = nums2[i];
                        m++;
                        break;
                    } else if (nums1[x] == 0 && x >= m) {
                        nums1[x] = nums2[i];
                        break;
                    }
                }
            }
        }
    }

    /**
     * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
     * The relative order of the elements may be changed.
     * <p>
     * Since it is impossible to change the length of the array in some languages, you must instead have the result be
     * placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
     * <p>
     * Return k after placing the final result in the first k slots of nums.
     * <p>
     * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
     */
    static class RemoveElement {
        public static int removeElement(int[] nums, int val) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == val) {
                    //we shift all the array
                    for (int j = nums.length - 1; j > i; j--) {
                        if (nums[j] != val) {
                            nums[i] = nums[j];
                            nums[j] = val;
                            break;
                        }
                    }
                }
            }
            int j = 0;
            while (nums[j] != val) {
                j++;
            }
            return j;
        }

        public static int removeElementv2(int[] nums, int val) {
            int count = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val){
                    nums[count] = nums[i];
                    count++;
                }
            }
            return count;
        }

    }


}
