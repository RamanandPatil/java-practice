package problemoftheday;

import java.util.Scanner;

/**
 * <a href="https://hyperskill.org/learn/daily/2170">Problem of the day:
 * Chocolate</a>
 * <p>
 * A chocolate bar has the shape of a rectangle, divided into NxM segments.
 * You can break down this chocolate bar into two parts by a single straight
 * line (only once). Find whether you can break off exactly K segments from
 * the chocolate. Each segment is 1x1.
 * <p>
 * Input data format
 * <p>
 * The program gets an input of three integers: N, M, K
 * <p>
 * Output data format
 * <p>
 * The program must output one of the two words: YES or NO.
 * <p>
 * Sample Input 1:
 * <p>
 * 4
 * 2
 * 6
 * <p>
 * Sample Output 1:
 * <p>
 * YES
 * <p>
 * Sample Input 2:
 * <p>
 * 2
 * 10
 * 7
 * <p>
 * Sample Output 2:
 * <p>
 * NO
 * <p>
 * Sample Input 3:
 * <p>
 * 7
 * 4
 * 21
 * <p>
 * Sample Output 3:
 * <p>
 * YES
 */
public class Chocolate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        if (N * M >= K && (K % N== 0 || K % M == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
