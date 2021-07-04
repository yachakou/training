package training.algorithms.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountTripletsWithSumSmallerThanValueTest {

    @Test
    public void countTripletsWithSumSmallerThanValue() {
        int[] input = {5, 1, 3, 4, 7};
        int result = CountTripletsWithSumSmallerThanValue.countTripletsWithSumSmallerThanValue(input, 12);

        Assertions.assertEquals(4, result);
    }

    @Test
    public void countTripletsWithSumSmallerThanValueEfficient() {
        int[] input = {4, 1, 0, 8, 6, 3};
        int result = CountTripletsWithSumSmallerThanValue.countTripletsWithSumSmallerThanValueEfficient(input, 10);

        Assertions.assertEquals(7, result);
    }
}