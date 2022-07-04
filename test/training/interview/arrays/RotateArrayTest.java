package training.interview.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RotateArrayTest {

    @Test
    void rotate() {
        int[] expected = new int[]{4, 5, 1, 2, 3};

        int[] array = {1, 2, 3, 4, 5};
        RotateArray.rotate(array, 12);

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], array[i]);
        }
    }

    @Test
    void rotate2() {
        int[] expected = new int[]{4, 5, 1, 2, 3};

        int[] inputs = {1, 2, 3, 4, 5};
        int[] array = RotateArray.rotate2(inputs, 12);

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], array[i]);
        }

    }
}