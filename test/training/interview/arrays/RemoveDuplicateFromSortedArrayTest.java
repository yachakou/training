package training.interview.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicateFromSortedArrayTest {
    @Test
    void removeDuplicates() {
        int[] numbers = new int[]{1, 1, 2, 2};
        int[] expected = new int[]{1, 2};

        int result = RemoveDuplicateFromSortedArray.removeDuplicates(numbers);

        assertEquals(2, result);
        for (int i = 0; i < result; i++) {
            assertEquals(expected[i], numbers[i]);
        }
    }
}