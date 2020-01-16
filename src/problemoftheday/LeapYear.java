package problemoftheday;

import java.util.Scanner;

/**
 * Java
 * →
 * Basic syntax and simple programs
 * →
 * Control flow statements
 * →
 * Conditional statement
 * <p>
 * Leap year
 * <p>
 * Failure rate is 69%
 * <p>
 * Hard
 * <p>
 * 7 minutes
 * <p>
 * 1503 users solved this problem. Latest completion was about 3 hours ago.
 * <p>
 * Code Challenge — Write a program
 * <p>
 * Find whether the given year is a leap year.
 * <p>
 * Just a reminder: leap years are those years in which the year’s number is
 * either divisible by 4, but not divisible by 100, or divisible by 400 (for
 * example, the year 2000 is a leap year, but the year 2100 will not be a
 * leap year).
 * <p>
 * The program should work correctly for the years 1900 ≤ n ≤ 3000.
 * <p>
 * Output "Leap" (case-sensitive) if the given year is a leap year, and
 * "Regular" otherwise.
 * <p>
 * It is enough to write a simple conditional statement to solve this task.
 * <p>
 * Sample Input 1:
 * <p>
 * 2100
 * <p>
 * Sample Output 1:
 * <p>
 * Regular
 * <p>
 * Sample Input 2:
 * <p>
 * 2000
 * <p>
 * Sample Output 2:
 * <p>
 * Leap
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isLeap =
                number % 4 == 0 && number % 100 != 0 || number % 400 == 0;
        if (isLeap) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}
