import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int res = 0;
        do {
            a = scanner.nextInt();
            if (res <= a) {
                res = a;
            }
        }
        while (a != 0);
        System.out.println(res);
    }
}