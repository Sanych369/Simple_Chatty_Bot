import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (scanner.nextInt() != 0) {
            i++;
        }
        System.out.println(i);
    }
}