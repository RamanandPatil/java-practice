package arrays;

import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int[][] array = new int[rows][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        boolean isSymmetric = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (i != j && array[i][j] != array[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) {
                break;
            }
        }
        System.out.println(isSymmetric ? "YES" : "NO");
    }
}
