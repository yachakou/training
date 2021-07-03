package training.algorithms.arrays;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FindPairThatEqualASumTest {

    @Test
    public void findPairsThatEqualsSum() {
        int[] input = {1, 5, 4, 2};

        Map<Integer, FindPairThatEqualASum.Pair<Integer>> expected = new HashMap<>();
        expected.put(0, new FindPairThatEqualASum.Pair<>(1, 5));
        expected.put(1, new FindPairThatEqualASum.Pair<>(4, 2));
        expected.put(2, new FindPairThatEqualASum.Pair<>(2, 4));

        List<FindPairThatEqualASum.Pair<Integer>> result = FindPairThatEqualASum.findPairsThatEqualsSum(input, 6);

        assertEquals(result.size(), 3);
        for (int i = 0; i < expected.size(); i++) {
            final FindPairThatEqualASum.Pair<Integer> integerPair = result.get(i);
            final FindPairThatEqualASum.Pair<Integer> integerPair1 = expected.get(i);
            assertPosition(integerPair::getX, integerPair1::getX);
            assertPosition(integerPair::getY, integerPair1::getY);
        }

    }

    private void assertPosition(Supplier<Integer> actualResult, Supplier<Integer> expected) {
        assertEquals(expected.get(), actualResult.get());
    }
}