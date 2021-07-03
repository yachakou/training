package training.algorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPairThatEqualASum {
    public static void main(String[] args) {
        int[] numbers = {1, 7, 6, 2, 4, 4};
        int sum = 8;

        System.out.println("Given array " + Arrays.toString(numbers));
        System.out.println("Given sum " + sum);
        printPairs(findPairsThatEqualsSum(numbers, sum));
    }


    public static List<Pair<Integer>> findPairsThatEqualsSum(int[] numbers, int sum) {
        List<Pair<Integer>> pairs = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == sum) {
                    pairs.add(new Pair<>(numbers[i], numbers[j]));
                }
            }
        }

        return pairs;
    }


    private static void printPairs(List<Pair<Integer>> pairsThatEqualsSum) {
        pairsThatEqualsSum.forEach(System.out::println);
    }

    public static class Pair<T> {
        private T x;
        private T y;

        public Pair(T x, T y) {
            this.x = x;
            this.y = y;
        }

        public T getX() {
            return x;
        }

        public T getY() {
            return y;
        }

        @Override
        public String toString() {
            return "x = " + x + ", y = " + y;
        }
    }

}
