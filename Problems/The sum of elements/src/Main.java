import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int sc = 0;
        do {
            sc = scanner.nextInt();
            sum += sc;
        }
        while (sc != 0);
        System.out.println(sum);
    }
}