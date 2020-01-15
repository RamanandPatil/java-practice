import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.print(getEvenLongestPalindromicSubArray(word));
    }

    private static int getEvenLongestPalindromicSubArray(String numString) {
        Map<Character, Integer> map = new HashMap<>();
        char[] array;
        int len = numString.length();
        boolean palindrome;
        int maxPalindrome = 0;

        for (int j = 2; j < len; j += 2) {
            for (int i = 0; i <= len - j; i++) {
                array = numString.substring(i, i + j).toCharArray();
                map.clear();
                palindrome = true;
                for (char c : array) {
                    map.put(c, map.containsKey(c) ? (map.get(c) + 1) : 1);
                }
                for (Entry<Character, Integer> entry : map.entrySet()) {
                    if (entry.getValue() % 2 != 0) {
                        palindrome = false;
                        break;
                    }
                }
                if (palindrome) {
                    maxPalindrome = array.length;
                    break;
                }
            }
        }
        return maxPalindrome;
    }
}


