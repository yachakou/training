package training.interview.arrays;

public class RotateImage {

    public static void rotate(int[][] matrix) {


        int left = 0;
        int right = matrix.length - 1;


        while (left < right) {
            for (int i = 0; i < right - left; i++) {

                int bottom = right;
                int top = left;

                int topLeft = matrix[top][left + i];
                matrix[top][left + i] = matrix[bottom - i][left];

                matrix[bottom - i][left] = matrix[bottom][right - i];

                matrix[bottom][right - i] = matrix[top + i][right];

                matrix[top + i][right] = topLeft;
            }
            right-=1;
            left+=1;
        }

//        for (int j = 0; j < matrix.length; j++) {
//            System.out.println("BEFORE " + Arrays.deepToString( matrix));
//
//            for (int i = 0; i < matrix.length; i++) {
//
//                System.out.println(matrix[i][j] + " --> " + matrix[matrix.length - 1 - j][i]);
//
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[matrix.length - 1 - j][i];
//                matrix[matrix.length - 1 - j][i] = temp;
//
//            }
//            System.out.println("AFTER " + Arrays.deepToString(matrix));
//
//            System.out.println("----------------------------------------------");
//
//        }
    }

}
