import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        for (int i = 0; i < 1000; i++) {
            double res = a * (Math.pow(i, 3)) + b * (Math.pow(i, 2)) + c * i + d;
            if (res == 0 && Math.sqrt(res) >= 0) {
                System.out.println(i);
            }
        }
    }
}