package training.algorithms.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ReversStringWithoutAffectingSpecialCharTest {

    @ParameterizedTest
    @CsvSource(delimiter = ':',
            value = {
                    "abc,cvb:bvc,cba",
                    "abc*sd&,cv:vc,*ds&,ba",
                    "aqsd!%df^b:b^fd!%ds^a"
            })
    public void reverseWithoutCHangingSpecialChars(final String source, final String expected) {
        final String result = ReversStringWithoutAffectingSpecialChar.reverseWithoutCHangingSpecialChars(source);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("provideStrings")
    public void reverseWithoutChangingSpecialCharsSecondMethod(final String source, final String expected) {
        final String result = ReversStringWithoutAffectingSpecialChar.reverseWithoutChangingSpecialCharsSecondMethod(source);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> provideStrings() {
        return Stream.of(Arguments.of("abc,cvb", "bvc,cba"),
                Arguments.of("!-/hjk>?sd", "!-/dsk>?jh"));
    }
}