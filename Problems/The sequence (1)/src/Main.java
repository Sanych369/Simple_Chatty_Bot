import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int count = 1;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j < i; j++) {
                if (count > a) {
                    break;
                }
                count++;
                System.out.print(i + " ");
            }
        }
    }
}