import java.util.Scanner;

/**
 * Conditional statement → Queens
 * Code Challenge — Write a program
 * You are given coordinates of two queens on a chess board. Find out whether
 * or not they hit each other.
 *
 * Input data format
 *
 * Four integer numbers x_1, y_1, x_2, y_2x
 * 1
 * ​
 * ,y
 * 1
 * ​
 * ,x
 * 2
 * ​
 * ,y
 * 2
 * ​
 * .
 *
 * Output data format
 *
 * Type "YES" (uppercase) if they hit each other or "NO" if they don't.
 *
 * You may need a method that calculates the absolute value of the number, so
 * here it is:
 *
 * Math.abs(n)
 * Hint
 *
 * Sample Input 1:
 *
 * 1 1 3 3
 * Sample Output 1:
 *
 * YES
 * Sample Input 2:
 *
 * 1 1 4 3
 * Sample Output 2:
 *
 * NO
 * Sample Input 3:
 *
 * 2 2 5 2
 * Sample Output 3:
 *
 * YES
 */


public class Queens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        if (Math.abs(x1 - x2) == Math.abs(y1 - y2) // diagonal
            || (x1 == x2 || y1 == y2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
