package training.interview.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {
    @Test
    void twoSum() {
        int[] ints = {2, 7, 11, 15};
        int[] ints1 = TwoSum.twoSum(ints, 9);

        Assertions.assertArrayEquals(new int[]{0, 1}, ints1);
    }
}