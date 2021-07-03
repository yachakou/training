package training.algorithms.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindLargestAndSmallestTest {


    @Test
    public void findLargestSmallest() {
        int[] numbers = {-123, 2311, 1245689, 0, 1533333, -65466, 45, 102329, 2};

        final FindLargestAndSmallest.LargestSmallest result = FindLargestAndSmallest.findLargestAndSmallest(numbers);

        assertEquals(result.getSmallest(), -65466);
        assertEquals(result.getLargest(), 1533333);

    }
}