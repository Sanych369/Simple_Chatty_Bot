import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        if (k < m || k < n || k > n * m) {
            System.out.println("NO");
        } else if ((n * m) % k == n || (n * m) % k == m) {
            System.out.println("YES");
        } else if (k % n == 0 || k % m == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}