import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String b = "True";
        if (a > -15 && a <= 12) {
            System.out.println(b);
        } else if (a > 14 && a < 17) {
            System.out.println(b);
        } else if (a >= 19) {
            System.out.println(b);
        } else {
            System.out.println("False");
        }
    }
}