package training.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 8, 4, 5, 6, 6, 7, 8, 9, 10};
        int[] numbers2 = {1, 2, 3, 8, 4, 5, 6, 6, 7, 8, 9, 10};

        System.out.println("Before removing duplicate number : " + Arrays.toString(numbers));
        System.out.println("After removing duplicate number : " + Arrays.toString(removeDuplicate(numbers)));

        System.out.println("Before removing duplicate number : " + Arrays.toString(numbers2));
        System.out.println("After removing duplicate number : " + Arrays.toString(removeDupplicateUsingSet(numbers2)));
    }

    private static int[] removeDuplicate(int[] numbers) {
        Arrays.sort(numbers);

        int[] result = new int[numbers.length];
        int previous = numbers[0];
        result[0] = previous;

        for (int i = 1; i < numbers.length; i++) {

            int current = numbers[i];
            if (previous != current) {
                result[i] = current;
            } else {
                System.out.println("Find duplicate : " + previous);
            }
            previous = numbers[i];

        }

        return result;
    }

    private static int[] removeDupplicateUsingSet(int[] numbers) {
        HashSet<Integer> result = new HashSet<>();
        Arrays.stream(numbers).forEach(result::add);
        return Arrays.stream(result.toArray(new Integer[0])).mapToInt(i -> i).toArray();
    }
}
