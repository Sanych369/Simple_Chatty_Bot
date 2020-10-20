import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += n.charAt(i) - 48;
        }
        System.out.println(sum);
    }
}