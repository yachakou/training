package training.interview.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {
//        assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
//        assertEquals("", LongestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        assertEquals("a", LongestCommonPrefix.longestCommonPrefix2(new String[]{"ab","a"}));
        assertEquals("c", LongestCommonPrefix.longestCommonPrefix(new String[]{"cir","car"}));
        assertEquals("c", LongestCommonPrefix.longestCommonPrefix2(new String[]{"cir","car"}));
    }
}