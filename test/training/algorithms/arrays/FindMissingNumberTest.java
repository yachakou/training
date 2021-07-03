package training.algorithms.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMissingNumberTest {

    @Test
    public void findOneMissingNumber() {

        int[] list = {1, 3, 4, 5};

        int oneMissingNumber = FindMissingNumber.findOneMissingNumber(list, 5);

        assertEquals(oneMissingNumber, 2);
    }


    @Test
    public void findManyMissingNumber() {

        int[] list = {6, 8};
        int[] expected = {1, 2, 3, 4, 5, 7};

        int[] result = FindMissingNumber.findManyMissingNumber(list, 8);

        assertArrayEquals(expected, result);
    }
}