package training.interview.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoveZerosTest {

    @Test
    void moveZeroes() {
        int[] numbers = new int[]{0, 1, 0, 3, 12};

        MoveZeros.moveZeroes(numbers);

        int[] expected = new int[]{1, 3, 12, 0, 0};
        Assertions.assertArrayEquals(expected, numbers);
    }

    @Test
    void moveZeroes2() {
//        int[] numbers = new int[]{1, 0, 2, 0, 6};
        int[] numbers = new int[]{0, 1, 0, 3, 12};

        MoveZeros.moveZeroes2(numbers);
    }
}