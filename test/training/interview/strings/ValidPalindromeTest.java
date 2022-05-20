package training.interview.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @ParameterizedTest
    @CsvSource(value = {
            "A man, a plan, a canal: Panama/true",
            "race a car/false",
    }, delimiter = '/')
    public void reverseString(String word1,boolean expectedResult) {
        assertEquals(expectedResult, ValidPalindrome.isPalindrome(word1));
    }
}