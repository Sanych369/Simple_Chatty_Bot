import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt() * 3600;
        int m1 = scanner.nextInt() * 60;
        int s1 = scanner.nextInt();

        int h2 = scanner.nextInt() * 3600;
        int m2 = scanner.nextInt() * 60;
        int s2 = scanner.nextInt();

        System.out.println(h2 + m2 + s2 - h1 - m1 - s1);
    }
}