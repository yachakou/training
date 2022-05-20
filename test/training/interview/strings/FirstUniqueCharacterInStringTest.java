package training.interview.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstUniqueCharacterInStringTest {


    @ParameterizedTest
    @CsvSource({"leetcode,0", "loveleetcode,2", "aabb,-1"})
    public void firstUniqChar(String word, int value) {
        assertEquals(value, FirstUniqueCharacterInString.firstUniqChar(word));
    }

    @ParameterizedTest
    @CsvSource({"leetcode,0", "loveleetcode,2", "aabb,-1"})
    public void firstUniqCharv2(String word, int value) {
        assertEquals(value, FirstUniqueCharacterInString.firstUniqCharV2(word));
    }
}