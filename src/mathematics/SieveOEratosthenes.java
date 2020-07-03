package mathematics;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOEratosthenes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        // System.out.println(Arrays.toString(array));
        for (int i = 0; i < size; i++) {
            getPrimeNumbers(array[i]);
        }
    }

    public static void getPrimeNumbers(int number) {
        if (number < 2) {
            return;
        }
        // just to start from 2 to number, make array size number + 1
        boolean[] primes = new boolean[number + 1];
        Arrays.fill(primes, true);
        int prime = 2;
        for (int i = prime; i <= number; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= number; j += i) {
                    primes[j] = false;
                }
            }
        }
        for (int i = 2; i <= number; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
