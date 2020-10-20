import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int a = 0;
        int max = 0;

        for (int j = 0; j < i; j++) {
            int b = scanner.nextInt();
            if (b % 4 == 0) {
                a = b;
            }
            if (max < a) {
                max = a;
            }
        }
        System.out.println(max);
    }
}