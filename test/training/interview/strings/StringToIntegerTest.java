package training.interview.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringToIntegerTest {

    @Test
    void myAtoi() {

        Assertions.assertEquals(-42, StringToInteger.myAtoi("     -42"));
        Assertions.assertEquals(0, StringToInteger.myAtoi("     -"));
        Assertions.assertEquals(Integer.MAX_VALUE, StringToInteger.myAtoi("22222222222222222222222222222"));
        Assertions.assertEquals(Integer.MIN_VALUE, StringToInteger.myAtoi("-2222222222222tesd"));
        Assertions.assertEquals(0, StringToInteger.myAtoi(""));
    }
}