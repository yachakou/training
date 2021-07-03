package training.algorithms.arrays;

public class FindLargestAndSmallest {
    public static void main(String[] args) {
        int[] numbers = {-10, 11, 45689, 17, 15, -66, 45, 102329, 2};
        final LargestSmallest largestAndSmallest = findLargestAndSmallest(numbers);

        System.out.printf("Smallest number is %d%n", largestAndSmallest.getSmallest());
        System.out.printf("Largest number is  %d%n", largestAndSmallest.getLargest());
    }

    public static LargestSmallest findLargestAndSmallest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int n : numbers) {

            if (n < smallest) {
                smallest = n;
            }

            if (n > largest) {
                largest = n;
            }

        }


        return new LargestSmallest(largest, smallest);

    }

    public static class LargestSmallest {
        int largest;
        int smallest;

        public LargestSmallest(int largest, int smallest) {
            this.largest = largest;
            this.smallest = smallest;
        }

        public int getLargest() {
            return largest;
        }

        public int getSmallest() {
            return smallest;
        }
    }
}
