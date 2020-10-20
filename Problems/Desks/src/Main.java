import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a % 2 != 0) {
            a += 1;
        }
        if (b % 2 != 0) {
            b += 1;
        }
        if (c % 2 != 0) {
            c += 1;
        }
        int sum = a + b + c;
        System.out.println(sum / 2);
    }
}