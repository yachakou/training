package training.interview.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxProfitsTest {
    @Test
    void name() {
        int[] numbers = new int[]{7, 1, 5, 3, 6, 4};

        int result = MaxProfits.maxProfit(numbers);

        assertEquals(7, result);
    }
}