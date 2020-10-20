import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int j = 0; j < i; j++) {
            int k = scanner.nextInt();
            if (k == 5) {
                a++;
            }
            if (k == 4) {
                b++;
            }
            if (k == 3) {
                c++;
            }
            if (k == 2) {
                d++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}