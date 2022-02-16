package training.algorithms.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArraysExercicesTest {

    @Test
    public void maxConsecutiveOnes() {
        ArraysExercices.MaxConsecutiveOnes solution = new ArraysExercices.MaxConsecutiveOnes();
        int[] data = {1, 1, 0, 1, 1, 1};
        int maxConsecutiveOnes = solution.findMaxConsecutiveOnes(data);

        assertEquals(maxConsecutiveOnes, 3);

        System.out.println(maxConsecutiveOnes);
    }

    @Test
    public void findNumbersEvenNumberDigits() {
        ArraysExercices.FindNumbersEvenNumberDigits solution2 = new ArraysExercices.FindNumbersEvenNumberDigits();
        int[] data = {555, 901, 482, 1771};
        int maxConsecutiveOnes = solution2.findNumbers(data);

        assertEquals(maxConsecutiveOnes, 1);
    }

    @Test
    public void squaresSortedArray() {
        int[] data = {-4, -1, 0, 3, 10};
        int[] expected = {0, 1, 9, 16, 100};
        ArraysExercices.SquaresSortedArray squaresSortedArray = new ArraysExercices.SquaresSortedArray();
        int[] ints = squaresSortedArray.sortedSquares(data);

        for (int i = 0; i < ints.length; i++) {
            assertEquals(ints[i], expected[i]);
        }
    }

    @ParameterizedTest
    @MethodSource
    public void duplicateZeros(int[] tab) {

        ArraysExercices.DuplicateZeros.duplicateZeros(tab);
    }

    public static Stream<Arguments> duplicateZeros() {
        return Stream.of(Arguments.of(new int[]{1, 0, 2, 3, 0, 4, 5, 0}),
                Arguments.of(new int[]{0, 0, 0, 0, 0, 0, 0}));
    }

    public static Stream<Arguments> mergeSortedArray() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3),
                Arguments.of(new int[]{-1, 3, 0, 0, 0, 0, 0}, 2, new int[]{0, 0, 1, 2, 3}, 5));
    }

    @ParameterizedTest
    @MethodSource
    public void mergeSortedArray(int[] array1, int m, int[] array2, int n) {

        ArraysExercices.MergeSortedArray.merge(array1, m, array2, n);

        System.out.println(" result " + Arrays.toString(array1));
    }

    @Test
    public void removeElement() {
        int[] array = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
//        int v1 = ArraysExercices.RemoveElement.removeElement(array, 2);

//        Assertions.assertEquals(v1, 5);
        int v2 = ArraysExercices.RemoveElement.removeElementv2(array, 2);
        Assertions.assertEquals(v2, 5);

    }
}