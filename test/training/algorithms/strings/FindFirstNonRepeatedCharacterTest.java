package training.algorithms.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FindFirstNonRepeatedCharacterTest {

    @ParameterizedTest
    @CsvSource(delimiter = ':',
            value = {"hello:h",
                    "swiss:w"})
    public void findFirstNonRepeatedCharacter(String value, String expected){
        String result = FindFirstNonRepeatedCharacter.findFirstNonRepeatedCharacter(value);
        Assertions.assertEquals(expected, result);
    }
}