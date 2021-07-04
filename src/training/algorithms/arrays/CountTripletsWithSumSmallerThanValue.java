package training.algorithms.arrays;

import java.util.Arrays;

public class CountTripletsWithSumSmallerThanValue {
    public static void main(String[] args) {
        int[] arr = {-2, 0, 1, 3};

        System.out.printf("Number of triplets found : %s", countTripletsWithSumSmallerThanValue(arr, 2));
    }

    public static int countTripletsWithSumSmallerThanValue(int[] array, int sum) {
        int res = 0;

        int n = array.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (array[i] + array[j] + array[k] < sum) {
                        res++;
                    }
                }
            }
        }
        return res;
    }

    public static int countTripletsWithSumSmallerThanValueEfficient(int[] array, int sum) {
        Arrays.sort(array);
        int res = 0;

        int length = array.length;
        for (int i = 0; i < length - 2; i++) {
            int j = i + 1, k = length - 1;
            while (j < k) {
                if (array[i] + array[j] + array[k] >= sum) {
                    k--;
                } else {
                    res += (k - j);
                    j++;
                }
            }
        }
        return res;
    }
}
