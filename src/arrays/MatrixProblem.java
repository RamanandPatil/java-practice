package arrays;

import java.util.Scanner;

public class MatrixProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder lines = new StringBuilder(scanner.nextLine());
        while (!scanner.hasNext("end")) {
            lines.append(", ");
            lines.append(scanner.nextLine());
        }
        System.out.println(lines);
        String[] rowLines = lines.toString().split(",");
        int rows = rowLines.length;
        int[][] matrix = new int[rows][];
        for (int i = 0; i < rows; i++) {
            String[] columns = rowLines[i].split(" ");
            matrix[i] = new int[columns.length];
            for (int j = 0; j < columns.length; j++) {
                matrix[i][j] = Integer.parseInt(columns[j]);
            }
        }

        // int[][] result = new int[rows][columns];
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < columns; j++) {
        //         int sum = 0;
        //         if (i == 0) {
        //             sum += array[rows - 1][j];
        //         } else {
        //             sum += array[i - 1][j];
        //         }
        //
        //         if (i + 1 == rows) {
        //             sum += array[0][j];
        //         } else {
        //             sum += array[i + 1][j];
        //         }
        //
        //         if (j == 0) {
        //             sum += array[i][columns - 1];
        //         } else {
        //             sum += array[i][j - 1];
        //         }
        //
        //         if (j + 1 == rows) {
        //             sum += array[i][0];
        //         } else {
        //             sum += array[i][j + 1];
        //         }
        //         result[i][j] = sum;
        //     }
        // }
        //
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
