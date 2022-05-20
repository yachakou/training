package training.interview.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RotateArrayTest {

    @Test
    void rotate() {
//        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
//        int[] expected = new int[]{5, 6, 7, 1, 2, 3, 4};
//        RotateArray.rotate(array, 3);
//
//        for (int i = 0; i < expected.length; i++) {
//            assertEquals(expected[i], array[i]);
//        }

        int[] array2 = new int[]{1, 2, 3, 4, 5};
        RotateArray.rotate(array2, 12);

    }
}