import java.util.Scanner;

public class Main {

    public static long power(int n, int m) {
        long l = 1L;
        if (m == 0) {
            return 1;
        } else {
            for (int i = 0; i < m; i++) {
                l *= n;
            } // write your code here
            return l;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}