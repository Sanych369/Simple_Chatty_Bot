import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int max = 0;
        for (int i = 0; i < start; i++) {
            int k = scanner.nextInt();
            if (k % 4 == 0 && k > max) {
                max = k;
            }
        }
        System.out.println(max);
    }
}