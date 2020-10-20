import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int a = 0;
        for (int j = 0; j < i; j++) {
            int k = scanner.nextInt();
            if (k % 6 == 0) {
                a += k;
            }
        }
        System.out.println(a);
    }
}