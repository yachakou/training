package training.arrays;

public class FindLargestAndSmallest {
    public static void main(String[] args) {
        int[] numbers = {-10, 11, 45689, 17, 15, -66, 45, 102329, 2};
        findLargestAndSmallest(numbers);
    }

    private static void findLargestAndSmallest(int[] numbers) {
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

        System.out.printf("Smallest number is %d%n", smallest);
        System.out.printf("Largest number is  %d%n", largest);


    }
}
