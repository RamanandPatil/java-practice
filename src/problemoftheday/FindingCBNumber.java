package problemoftheday;

import java.util.*;

public class FindingCBNumber {
    static final Set<Integer> CB_NUMS = Set
            .of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        String digitString = scanner.next();

        int cbNumCount = 0;
        int currentPos = 0;

        while (currentPos < size) {
            for (int i = currentPos + 1; i <= size; i++) {
                int num = Integer
                        .parseInt(digitString.substring(currentPos, i));
                if (isCbNumber(num)) {
                    cbNumCount++;
                    currentPos = i;
                }
            }
            if (currentPos == size) {
                break;
            }
        }
        System.out.println(cbNumCount);
    }


    public static boolean isCbNumber(int number) {
        if (number <= 1) {
            return false;
        }
        if (CB_NUMS.contains(number)) {
            return true;
        }
        for (int num : CB_NUMS) {
            if (number % num == 0) {
                return false;
            }
        }
        return true;
    }
}