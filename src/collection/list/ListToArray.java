package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The list of strings is given.
 *
 * List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr
 * .Yellow", "Mr.Red"));
 *
 * Convert it to the string array by name strArray.
 *
 * The code for displaying the array is already written.
 * Sample Input:
 *
 * Sample Output:
 *
 * Mr.Green
 * Mr.Yellow
 * Mr.Red
 */
public class ListToArray {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(
                Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

        String[] strArray = nameList.toArray(new String[0]);
        for (String name : strArray) {
            System.out.println(name);
        }
    }
}
