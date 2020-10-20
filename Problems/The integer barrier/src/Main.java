import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            sum += a;
            if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            } else if (a == 0) {
                System.out.println(sum);
                break;
            }
        }
    }
}