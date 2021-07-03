package training.arrays;

import java.util.Arrays;
import java.util.BitSet;

public class FindMissingNumber {

    public static void main(String[] args) {
        int[] oneNumberMissing = {4, 1, 3, 7, 5, 6, 8, 9, 10}; // one missing number
        int[] manyNumbersMissing = {4, 1, 7, 5, 6, 8, 10}; // 3 missing number

        System.out.println("Missing Number : " + findOneMissingNumber(oneNumberMissing, 10));
        findManyMissingNumber(manyNumbersMissing, 10);
    }

    private static int findOneMissingNumber(int[] numbers, int expectedSize) {
        Arrays.sort(numbers);
        int actualSum = Arrays.stream(numbers).reduce(0, Integer::sum);
        int expecteSum = (expectedSize * (expectedSize + 1)) / 2;
        return expecteSum - actualSum;
    }

    private static void findManyMissingNumber(int[] numbers, int expectedSize) {
        int missingNumbers = expectedSize - numbers.length;
        BitSet set = new BitSet(expectedSize);
        for (int n : numbers) {
            set.set(n - 1);
        }

        System.out.printf("Missing exactly %s numbers. \n", missingNumbers);

        int lastMissingIndex = 0;
        System.out.println("Missing numbers are :  ");

        for (int i = 0; i < missingNumbers; i++) {
            lastMissingIndex = set.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
    }


}
