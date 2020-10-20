import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            if (a == 0) {
                break;
            } else if (a % 2 == 0) {
                System.out.println("even");
            } else if (a % 2 == 1) {
                System.out.println("odd");
            }
        }
    }
}