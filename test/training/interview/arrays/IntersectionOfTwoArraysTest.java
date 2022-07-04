package training.interview.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class IntersectionOfTwoArraysTest {

    @Test
    public void IntersectionOfTwoArrays() {
        int[] l1 = new int[]{4, 9, 5};
        int[] l2 = new int[]{9, 4, 9, 8, 4};

        int[] intersect = IntersectionOfTwoArrays.intersect(l1, l2);

        int[] expectedResult = new int[]{4, 9};
        assertArrayEquals(expectedResult, intersect);
    }

    @Test
    public void IntersectionOfTwoArraysV2() {
        int[] l1 = new int[]{1, 2, 2, 1};
        int[] l2 = new int[]{2, 2};

        int[] intersect = IntersectionOfTwoArrays.intersectv2(l1, l2);

        int[] expectedResult = new int[]{2, 2};
        assertArrayEquals(expectedResult, intersect);
    }
}