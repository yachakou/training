package training.algorithms.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CountVowelsAndCononantsTest {

    @ParameterizedTest
    @CsvSource(value = {
            "abcde,2,3",
            "eeefeeeu,7,1"
    })
    public void countVowelsandConsonants(String test, int nbVowels, int nbConsonants) {


        CountVowelsAndCononants.NumberVowelsConsonants numberVowelsConsonants = CountVowelsAndCononants.countVowelsandConsonants(test);
        Assertions.assertEquals(nbVowels, numberVowelsConsonants.getCountVowels());
        Assertions.assertEquals(nbConsonants, numberVowelsConsonants.getCountConsonants());
    }

}