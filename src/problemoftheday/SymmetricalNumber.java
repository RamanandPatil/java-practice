package problemoftheday;

import java.util.Scanner;

/**
 * <a href="https://hyperskill.org/learn/daily/2166">Problem Of the Day: </a>
 * Symmetrical number
 * <p>
 * Given a four-digit number. Determine whether its decimal notation is
 * symmetric. If the number is symmetric, output 1; otherwise output any
 * other integer. The number may have less than four digits; in this case you
 * should assume that its decimal notation is complemented by insignificant
 * zeros on the left.
 * <p>
 * Sample Input 1:<br>
 * 2002
 * <p>
 * Sample Output 1:
 * <p>
 * 1
 * <p>
 * Sample Input 2:
 * <p>
 * 2008
 * <p>
 * Sample Output 2:
 * <p>
 * 37
 */
public class SymmetricalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // The below is the very inefficient method, but since we are only
        // dealing with 4 digit numbers and studying the conditional
        // statements this should suffice.
        // A better solution will be generic to any number of digits.
        // Should work by scanning last and first digits and so on...
        int firstDigit = number % 10;
        if (number != 0) {
            number = number / 10;
        }
        int secondDigit = number % 10;
        if (number != 0) {
            number = number / 10;
        }

        int thirdDigit = number % 10;
        if (number != 0) {
            number = number / 10;
        }

        int fourthDigit = number % 10;
        if (firstDigit == fourthDigit && secondDigit == thirdDigit) {
            System.out.println(1);
        } else {
            System.out.println((int) (Math.random() * 10) + 2);
        }
    }
}
