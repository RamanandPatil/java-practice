import java.util.Scanner;

/**
 * Check a number is positive
 * Code Challenge — Write a program
 * Write a program that reads the number and prints YES if it is positive.
 * Otherwise, the program should print NO.
 *
 * Do not forget that zero is not a positive number.
 *
 * Sample Input 1:
 *
 * 7
 * Sample Output 1:
 *
 * YES
 */
public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String positive = number > 0 ? "YES" : "NO";
        System.out.println(positive);
    }
}
