import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean d = a > 0 && b <= 0 && c <= 0;
        boolean e = b > 0 && a <= 0 && c <= 0;
        boolean f = c > 0 && b <= 0 && a <= 0;
        boolean result = d || e || f;
        System.out.println(result);

    }
}