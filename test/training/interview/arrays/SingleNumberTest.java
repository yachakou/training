package training.interview.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleNumberTest {
    @Test
    void singleNumber() {
        int[] array = new int[]{2, 2, 1};

        int i = SingleNumber.singleNumber(array);

        assertEquals(i, 1);

    }

    @Test
    void singleNumberBitManipulation() {
        int[] array = new int[]{2, 2, 1};

        int i = SingleNumber.singleNumberBitManipulation(array);

        assertEquals(i, 1);

    }
}