package training.algorithms.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

class RemoveDuplicateCharacterInStringTest {

    @ParameterizedTest
    @MethodSource("testArgument")
    public void findDuplicate(String stringTotest, List<String> expectedResult) {
        Assertions.assertEquals(expectedResult, RemoveDuplicateCharacterInString.findDuplicateCharacterInString(stringTotest));
    }

    public static Stream<Arguments> testArgument() {
        return Stream.of(Arguments.of("nodup", Collections.EMPTY_LIST),
                Arguments.of("trtessvvhtttcv", Arrays.asList("s","t", "v")));
    }

}