package loops.forloop;

import java.util.Scanner;

/**
 * <a href="https://hyperskill.org/learn/step/2743">Problem</a>
 * <br>
 * The for-loop → The count of numbers divisible by N
 *
 * Without loop:
 * <a href="https://stackoverflow.com/questions/16381828/how-to-find-the-number-of-values-in-a-given-range-divisible-by-a-given-value"?>
 * How to find the number of values in a given range divisible by a given
 * value?
 * </a>
 *
 * <p>
 * Code Challenge — Write a program
 * Write a program that reads a, b, n and outputs the count of numbers
 * divisible by n in the range from a to b (a < b) inclusively.
 *
 * Note:  it is possible to write this program more efficiently without any
 * loops.
 *
 * Sample Input 1:
 *
 * 10 20 10
 * Sample Output 1:
 *
 * 2
 * Sample Input 2:
 *
 * 15 25 5
 * Sample Output 2:
 * 3
 * </p>
 */
public class DivisibleByN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                count++;
            }
        }
        System.out.println(count);

        // optional: Without loops:
        System.out.println(b / n - (a - 1) / n);
    }
}
