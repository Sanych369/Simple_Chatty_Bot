import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int res = a;
        do {
            System.out.print(res + " ");
            if (res % 2 == 0) {
                res = res / 2;
            } else if (res % 2 == 1 && res != 1) {
                res = res * 3 + 1;
            } else if (res == 1) {
                break;
            }
        }
        while (res >= 1);
    }
}