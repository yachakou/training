package training.interview.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlusOneTest {
    @Test
    void plusOne() {
        int[] numbers = new int[]{9, 9, 9, 9, 9};

        int[] ints = PlusOne.plusOne(numbers);

        int[] expeced = new int[]{1, 0, 0, 0, 0, 0};
        Assertions.assertArrayEquals(expeced, ints);
    }
}