package training.algorithms.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ReverseStringUsingRecursionTest {


    @ParameterizedTest
    @CsvSource(delimiter = ':',
            value = {
                    "abc:cba",
                    "kayak:kayak",
            })
    public void reverseStringUsingRecursion(final String source, final String expected) {
        final String result = ReverseStringUsingRecursion.reverseStringUsingRecursion(source);
        Assertions.assertEquals(expected, result);
    }
}