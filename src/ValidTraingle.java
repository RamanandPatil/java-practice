import java.util.Scanner;

public class ValidTraingle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();

        boolean valid = sideA + sideB > sideC && sideA + sideC > sideB &&
                        sideB + sideC > sideA;
        if (valid) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
