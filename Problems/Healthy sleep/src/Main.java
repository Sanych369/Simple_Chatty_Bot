import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); //минимум
        int b = scanner.nextInt(); //максимум
        int h = scanner.nextInt(); //часы сна

        if (h < a) {
            System.out.println("Deficiency");
        } else if (h > b) {
            System.out.println("Excess");
        } else if (h >= a && h <= b) {
            System.out.println("Normal");
        }
    }
}