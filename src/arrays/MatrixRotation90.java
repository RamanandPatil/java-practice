package arrays;

import java.util.Scanner;

public class MatrixRotation90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] array = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int[][] resultArray = new int[columns][rows];

        // starting row and column number for the result array to assign
        int i = 0;
        int j;

        // starting row and column number for the original array to read
        int k = rows - 1;
        int l;

        // initialize the resultArray with 90 degree rotated elements from
        // original array.
        for (; i < rows && k >= 0; i++, k--) {
            for (j = 0, l = 0; j < columns && l < columns; j++, l++) {
                resultArray[j][i] = array[k][l];
            }
        }

        // Print the resultArray.
        for (i = 0; i < columns; i++) {
            for (j = 0; j < rows; j++) {
                System.out.print(resultArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
