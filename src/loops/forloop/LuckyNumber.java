package loops.forloop;

import java.util.Scanner;

/**
 * <a href="https://hyperskill.org/learn/step/3797">Problem: </a>
 * The for-loop → Lucky number
 * <p>
 * Code Challenge — Write a program
 * Typical task for a job interview.
 * Given the number N with an even number of digits. If the sum of the first
 * half of the digits equals the sum of the second half of the digits, then
 * this number is considered lucky. For a given number, output "YES" if this
 * number is lucky, otherwise output "NO".
 * <p>
 * Sample Input 1:
 * <p>
 * 12344321
 * <p>
 * Sample Output 1:
 * <p>
 * YES
 * <p>
 * Sample Input 2:
 * <p>
 * 125322
 * <p>
 * Sample Output 2:
 * <p>
 * NO
 */
public class LuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int numOfDigits = (int) Math.floor(Math.log10(number) + 1);
        System.out.println(numOfDigits);
    }
}
