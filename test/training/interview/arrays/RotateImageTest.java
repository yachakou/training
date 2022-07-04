package training.interview.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RotateImageTest {


    @Test
    void rotateImage() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        System.out.println(Arrays.deepToString(matrix));
        RotateImage.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));

    }
}