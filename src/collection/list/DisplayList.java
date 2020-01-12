package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The list of strings is given.
 *
 * List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr
 * .Yellow", "Mr.Red"));
 * Output each its element in the loop. Each element must be in new line.
 *
 * Sample Input:
 *
 * Sample Output:
 *
 * Mr.Green
 * Mr.Yellow
 * Mr.Red
 */
public class DisplayList {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(
                Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

        //write your code here
        for (String name : nameList) {
            System.out.println(name);
        }
    }
}
