import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int bridgeCount = scanner.nextInt();
        int a = 0;
        for (int i = 1; i <= bridgeCount; i++) {
            a = scanner.nextInt();
            if (a <= busHeight) {
                if (scanner.hasNext()) {
                    System.out.println("Will crash on bridge " + i);
                    break;
                }
            } else if (!scanner.hasNext()) {
                System.out.println("Will not crash");
            }
        }
    }
}