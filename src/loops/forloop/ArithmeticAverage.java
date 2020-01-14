package loops.forloop;

import java.util.Scanner;

/**
 * <a href=https://hyperskill.org/learn/step/2191"">Problem: </a> The for-loop →
 * Arithmetic average
 * <p>
 * Code Challenge — Write a program
 * Write a program that reads two numbers aa and bb from the keyboard and
 * calculates and outputs to the console the arithmetic average of all
 * numbers from the interval [a; b][a;b], which are divisible by 33.
 * <p>
 * In the example below, the arithmetic average is calculated for the numbers
 * on the interval [-5; 12][−5;12]. Total numbers divisible by 33 on this
 * interval 66: -3, 0, 3, 6, 9, 12−3,0,3,6,9,12. Their arithmetic average
 * equals to 4.54.5
 * <p>
 * The program input contains intervals, which always contain at least one
 * number, which is divisible by 33.
 * <p>
 * Sample Input 1:
 * <p>
 * -5
 * 12
 * <p>
 * Sample Output 1:
 * <p>
 * 4.5
 */
public class ArithmeticAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int count = 0;
        double sum = 0.0;

        for (int i = a; i <= b ; i++) {
            if (i % 3 == 0) {
                count++;
                sum += i;
            }
        }
        System.out.println(sum/count);
    }
}
