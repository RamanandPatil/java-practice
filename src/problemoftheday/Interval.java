package problemoftheday;

import java.util.Scanner;

/**
 * Code Challenge — Write a program
 * <a href="https://hyperskill.org/learn/daily/2165">Problem of the Day</a>
 * <p>
 * Given an integer as input. Output True if its value is within the interval
 * (−15,12]∪(14,17)∪[19,+∞), and False otherwise (case sensitive).
 * <p>
 * Here are two types of brackets in the intervals:
 * <p>
 * parenthesis () exclude the border number;
 * and square brackets [] include the border number.
 * <p>
 * Sample Input 1:
 * <p>
 * 20
 * <p>
 * Sample Output 1:
 * <p>
 * True
 * <p>
 * Sample Input 2:
 * <p>
 * -20
 * <p>
 * Sample Output 2:
 * <p>
 * False
 */
public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean group1 = number > -15 && number <= 12;  // (−15,12]
        boolean group2 = number > 14 && number < 17;    // (14, 17)
        boolean group3 = number >= 19;                  // [19,+∞)

        System.out.println((group1 || group2 || group3) ? "True" : "False");

    }
}
