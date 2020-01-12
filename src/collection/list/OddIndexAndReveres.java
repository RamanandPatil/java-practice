package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Write a program that reads the list of integer number separated by spaces
 * from the standard input and then remove all numbers with even indexes (0,
 * 2, 4, and so on). After, the program should output the result sequence in
 * the reverse order.
 * Sample Input:
 * <p>
 * 1 2 3 4 5 6 7
 * Sample Output:
 * <p>
 * 6 4 2
 */
public class OddIndexAndReveres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                list.remove(i);
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}


