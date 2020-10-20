import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int d = 0;
        int e = 0;
        int f = 0;

        for (int i = 0; i < a; i++) {
            int k = scanner.nextInt();
            if (k == 0) {
                e++;
            } else if (k == -1) {
                d++;
            } else if (k == 1) {
                f++;
            }
        }
        System.out.println(e + " " + f + " " + d);
    }
}