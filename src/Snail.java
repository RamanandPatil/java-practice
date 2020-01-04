import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poleHeight = scanner.nextInt();
        int upSpeed = scanner.nextInt();
        int downSpeed = scanner.nextInt();

        int days = 0;
        int currentHeight = 0; // currentHeight while climbing
        while (currentHeight != poleHeight) {
            currentHeight += upSpeed;
            days++;
            if (currentHeight >= poleHeight) {
                break;
            }
            currentHeight -= downSpeed;
        }
        System.out.println(days);
    }
}
