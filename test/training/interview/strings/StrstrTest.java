package training.interview.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrstrTest {

    @Test
    void str() {
        assertEquals(2, Strstr.strStr("hello", "ll"));
        assertEquals(-1, Strstr.strStr("aaaba", "bba"));
        assertEquals(4, Strstr.strStr("mississippi", "issip"));
        assertEquals(4, Strstr.strStr2("mississippi", "issip"));

    }
}
