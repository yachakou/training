package training.algorithms.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CheckIfTwoStringAreAnagramTest {

    @ParameterizedTest
    @CsvSource(delimiter = ':', value = {
        "test:tset:true",
        "afg:ghtt:false",
        "qwe:ewqq:false",
    })
    public void isAnagram(String s1, String s2, boolean expected) {
        boolean result = CheckIfTwoStringAreAnagram.isAnagram(s1, s2);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource(delimiter = ':', value = {
            "vrf:frv:true",
            "abnm:ghtt:false",
            "vc:ewqq:false",
    })
    public void isAnagram2(String s1, String s2, boolean expected) {
        boolean result = CheckIfTwoStringAreAnagram.isAnagram(s1, s2);
        Assertions.assertEquals(expected, result);
    }
}