import java.util.Scanner;

/**
 * Conditional statement → Boxes
 *
 * Code Challenge — Write a program
 * Typical task for a job interview.
 * There are two boxes on the table. The first box has a size of X1 x Y1 x
 * Z1, and the second box has a size of X2 x Y2 x Z2. You need to determine
 * which box can be put inside another box. You can rotate both boxes as you
 * want.
 *
 *
 * Input contains two lines.
 * The first line contains numbers X1, Y1, Z1, the second line contains
 * numbers X2, Y2, Z2. All numbers are integers and greater than 0.
 *
 *
 *
 * If the sizes of the boxes are equal, output "Box 1 = Box 2".
 *
 * If the first box can be put inside the second box, output "Box 1 < Box 2".
 *
 * If the second box can be put inside the first box, output "Box 1 > Box 2".
 *
 * If none of the boxes can be put inside the other box, output "Incomparable".
 *
 * Sample Input 1:
 *
 * 1 1 1
 * 2 2 2
 * Sample Output 1:
 *
 * Box 1 < Box 2
 * Sample Input 2:
 *
 * 2 2 2
 * 1 2 2
 * Sample Output 2:
 *
 * Box 1 > Box 2
 * Sample Input 3:
 *
 * 1 2 3
 * 2 3 1
 * Sample Output 3:
 *
 * Box 1 = Box 2
 * Sample Input 4:
 *
 * 2 3 4
 * 1 3 5
 * Sample Output 4:
 *
 * Incomparable
 */
public class Boxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Box1 Size
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int z1 = scanner.nextInt();

        // Box2 Size
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int z2 = scanner.nextInt();


        // boolean equals = x1 == x2 && y1 == y2 && z1 == z2 ||
        //                  x1 == y2 && y1 == z2 && z1 == x2 ||
        //                  x1 == z2 && y1 == x2 && z1 == y2;
        //
        // boolean less = x1 <= x2 && y1 <= y2 && z1 <= z2 &&
        //                x1 <= y2 && y1 <= z2 && z1 <= x2 &&
        //                x1 <= z2 && y1 <= x2 && z1 <= y2;
        //
        // boolean greater = x1 >= x2 && y1 >= y2 && z1 >= z2 &&
        //                   x1 >= y2 && y1 >= z2 && z1 >= x2 &&
        //                   x1 >= z2 && y1 >= x2 && z1 >= y2;

        // if (equals) {
        //     System.out.println("Box 1 = Box 2");
        // } else if (less) {
        //     System.out.println("Box 1 < Box 2");
        // } else if (greater) {
        //     System.out.println("Box 1 > Box 2");
        // } else {
        //     System.out.println("Incomparable");
        // }
    }
}
