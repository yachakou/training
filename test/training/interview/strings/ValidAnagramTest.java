package training.interview.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidAnagramTest {


    @ParameterizedTest
    @CsvSource({
            "abc,cba,true",
            "anagram,nagaram,true",
            "rat,car,false"
    })
    public void reverseString(String word1, String word2, boolean expectedResult) {
        assertEquals(expectedResult, ValidAnagram.isAnagram(word1, word2));
    }
}