import java.util.Scanner;

/**
 * Code Challenge — Write a program
 * Groundhogs like to throw fun parties, and at their parties, they like to
 * eat Reeses peanut butter cups. But not too many Reeses or they feel sick!
 * A successful groundhog party will have between 10 and 20 Reeses peanut
 * butter cups, inclusive unless it is the weekend, in which case they will
 * need 15 to 25 Reeses peanut butter cups, inclusive.
 *
 * Write a Java program that reads two values:
 * the first is the number of Reeses peanut butter cups;
 * the second is a boolean representing whether it is the weekend.
 * The program must print the boolean value - the party is successful or not.
 *
 * Sample Input 1:
 *
 * 5 true
 * Sample Output 1:
 *
 * false
 * Sample Input 2:
 *
 * 16 false
 * Sample Output 2:
 *
 * true
 */
public class GroundhogsAtParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        boolean success = isWeekend ? number >= 15 && number <= 25
                                     : number >= 10 && number <= 20;
        System.out.println(success);
    }
}
