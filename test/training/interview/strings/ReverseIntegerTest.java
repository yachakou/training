package training.interview.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import training.interview.strings.ReverseInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {

    @ParameterizedTest
    @CsvSource({
            "123,321",
            "-456,-654",
            "0x7fffffff,0"
    })
    public void reverseint(int input, int expectedResult) {
        assertEquals(expectedResult, ReverseInteger.reverse(input));
    }
}