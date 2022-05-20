package training.interview.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import training.algorithms.other.RecursiveTraining;

class ReverseStringTest {

    @ParameterizedTest
    @CsvSource({
            "abc,cba",
            "aabbcc,ccbbaa"
    })
    public void reverseString(String input, String expectedResult) {
        char[] result = RecursiveTraining.reverseString(input.toCharArray());

        char[] expectedArray = expectedResult.toCharArray();
        for (int i = 0; i < expectedArray.length; i++) {
            Assertions.assertEquals(expectedArray[i], result[i]);
        }

    }
}