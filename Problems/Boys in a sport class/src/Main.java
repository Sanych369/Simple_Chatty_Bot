import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean d = a <= b && b <= c;
        boolean e = a >= b && b >= c;
        System.out.println(d || e);
    }
}