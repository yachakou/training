package training.algorithms.other;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RecursiveTrainingTest {


    @ParameterizedTest
    @CsvSource(value = {"3,6", "4,24", "10,3628800", "5,120"})
    public void factorial(int value, int expected) {
        int factorial = RecursiveTraining.factorial(value);
        Assertions.assertEquals(expected, factorial);
    }

    @ParameterizedTest
    @CsvSource(value = {"hello,olleh", "hannah,hannah",})
    public void reverseString(String value, String expected) {

        char[] result = RecursiveTraining.reverseString(value.toCharArray());

        char[] expectedArray = expected.toCharArray();
        for (int i = 0; i < expectedArray.length; i++) {
            Assertions.assertEquals(expectedArray[i], result[i]);
        }

    }

    @Test()
    public void swapPairs() {
        RecursiveTraining.ListNode listNode = new RecursiveTraining.ListNode(1,
                new RecursiveTraining.ListNode(2,
                        new RecursiveTraining.ListNode(3,
                                new RecursiveTraining.ListNode(4))));

        RecursiveTraining.ListNode result = RecursiveTraining.swapPairs(listNode);

        int[] values = {2, 1, 4, 3};
        int i = 0;
        RecursiveTraining.ListNode current = result;
        while (current != null) {
            System.out.println(current.val);
            Assertions.assertEquals(values[i], current.val);
            current = current.next;
            i++;
        }
    }

}