package training.algorithms.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindDuplicateNumberTest {

    @Test
    public void removeDuplicate() {

        int[] numbers = {1, 5, 3, 2, 2, 1};
        int[] expected = {1, 0, 2, 0, 3, 5};

        int[] ints = FindDuplicateNumber.removeDuplicate(numbers);

        assertArrayEquals(expected, ints);
    }

    @Test
    public void removeDupplicateUsingSet() {

        int[] numbers = {1, 5, 3, 2, 2, 1, 100, 99, 2 ,6, 99};
        int[] expected = {1, 2, 3, 99, 100, 5, 6};

        int[] ints = FindDuplicateNumber.removeDupplicateUsingSet(numbers);

        System.out.println(Arrays.toString(ints));
        assertArrayEquals(expected, ints);
    }

}