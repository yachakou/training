package training.interview.arrays;

public class TapeEquilibrium {

    public static int tapeEquilibrium(int[] A) {
        int total = 0;
        for (int j : A) {
            total += j;
        }
        int res = Integer.MAX_VALUE;
        int acc = 0;
        for (int i = 0; i < A.length - 1; i++) {
            acc += A[i];
            int abs = Math.abs(acc - (total - acc));
            if (abs < res) {
                res = abs;
            }
        }
        return res;
    }
}
