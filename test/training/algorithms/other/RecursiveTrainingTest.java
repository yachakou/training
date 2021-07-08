package training.algorithms.other;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RecursiveTrainingTest {


    @ParameterizedTest
    @CsvSource(value = {"3,6", "4,24", "10,3628800"})
    public void factorial(int value, int expected) {
        int factorial = RecursiveTraining.factorial(value);
        Assertions.assertEquals(expected, factorial);
    }

}