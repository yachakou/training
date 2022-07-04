package training.interview.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TapeEquilibriumTest {

    @Test
    void tapeEquilibrium() {
        int[] tab = new int[]{3, 1, 2, 4, 3};
        assertEquals(1,TapeEquilibrium.tapeEquilibrium(tab));
    }
}