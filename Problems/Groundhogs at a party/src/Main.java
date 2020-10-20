import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String str = scanner.next();
        if (a >= 10 && a <= 20 && "false".equals(str)) {
            System.out.println(true);
        } else {
            System.out.println(a >= 15 && a <= 25 && "true".equals(str));
        }
    }
}