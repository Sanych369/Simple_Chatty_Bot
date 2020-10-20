import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i % 2 == 0) {
            System.out.print(i + 2);
        } else {
            System.out.print(i + 1);
        }
    }
}