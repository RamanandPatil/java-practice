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
        // treating number as long number
        // findLuckyNumber();

        // Treating number as String to handle large numbers:
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        if (number.isEmpty() || number.length() <= 1 ||
            number.length() % 2 != 0) {
            System.out.println("NO");
            return;
        }
        int firstHalf = 0, secondHalf = 0;
        for (int i = 0; i < number.length() / 2; i++) {
            firstHalf += number.charAt(i);
            secondHalf += number.charAt(number.length() - 1 - i);
        }
        if (firstHalf == secondHalf) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    /**
     * Using the numbers not string.
     */
    private static void findLuckyNumber() {
        String result;
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        int numOfDigits = getNumberOfDigits(number);

        if (numOfDigits > 1 && numOfDigits % 2 == 0) {
            long firstHalf = 0, secondHalf = 0;
            for (int i = 0; i < numOfDigits / 2; i++) {
                firstHalf += number % 10;
                number /= 10;
            }
            for (int i = 0; i < numOfDigits / 2; i++) {
                secondHalf += number % 10;
                number /= 10;
            }
            if (firstHalf == secondHalf) {
                result = "YES";
            } else {
                result = "NO";
            }
        } else {
            result = "NO";
        }
        System.out.println(result);
    }

    private static int getNumberOfDigits(long number) {
        if (number < 0) {
            return 0;
        }
        if (number == 0) {
            return 1;
        }
        return (int) Math.floor(Math.log10(number) + 1);
    }
}

/*
// Solution provided on site:

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.next();
        int middle = num.length() / 2;
        String part1 = num.substring(0, middle);
        String part2 = num.substring(middle);

        int part1sum = 0;
        for (Character part1char : part1.toCharArray()) {
            part1sum += Integer.valueOf(part1char.toString());
        }

        int part2sum = 0;
        for (Character part2char : part2.toCharArray()) {
            part2sum += Integer.valueOf(part2char.toString());
        }

        if (part1sum == part2sum) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}




 */
