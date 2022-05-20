package training.interview.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainsDuplicateTest {

    @Test
    void containsDuplicate() {
        int[] numbers = new int[]{1, 1, 2, 3, 4, 4};
//        int[] numbers = new int[]{0, 1, 2, 3, 4, 5};

//        boolean result = ContainsDuplicate.containsDuplicate(numbers);
        boolean result = ContainsDuplicate.containsDuplicate2(numbers);

        assertEquals(result, true);
    }

}