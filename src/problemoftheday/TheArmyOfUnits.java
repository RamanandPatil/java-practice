package problemoftheday;

import java.util.Scanner;

/**
 * <a href="https://hyperskill.org/learn/daily/2735">Problem of the day: The
 * army of units</a>
 * <p>
 * In a computer game, each gamer has an army of units.
 * <p>
 * Write a program that will classify the army of your enemies corresponding
 * to the following rules:
 * <p>
 * Units:  Category <br>
 * less than 1: no army <br>
 * from 1 to 4: few <br>
 * from 5 to 9: several <br>
 * from 10 to 19: pack <br>
 * from 20 to 49: lots <br>
 * from 50 to 99: horde  <br>
 * from 100 to 249: throng  <br>
 * from 250 to 499: swarm  <br>
 * from 500 to 999: zounds  <br>
 * 1000 and more: legion  <br>
 * <p>
 * The program should read the number of units and output the corresponding
 * category.
 * <p>
 * Sample Input 1:
 * <p>
 * 5
 * <p>
 * Sample Output 1:
 * <p>
 * several
 * <p>
 * Sample Input 2:
 * <p>
 * 303
 * <p>
 * Sample Output 2:
 * <p>
 * swarm
 */
public class TheArmyOfUnits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int units = scanner.nextInt();

        if (units < 1) {
            System.out.println("no army");
        } else if (units <= 4) {
            System.out.println("few");
        } else if (units <= 9) {
            System.out.println("several");
        } else if (units <= 19) {
            System.out.println("pack");
        } else if (units <= 49) {
            System.out.println("lots");
        } else if (units <= 99) {
            System.out.println("horde");
        } else if (units <= 249) {
            System.out.println("throng");
        } else if (units <= 499) {
            System.out.println("swarm");
        } else if (units <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}
