import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int a = scanner.nextInt();
        int b = scanner.nextInt() + 1;
        System.out.println(str.substring(a, b));
    }
}