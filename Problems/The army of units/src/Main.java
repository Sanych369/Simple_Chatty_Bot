import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String noArmy = "no army";
        String pack = "pack";
        String throng = "throng";
        String zounds = "zounds";
        String legion = "legion";
        if (a < 1) {
            System.out.println(noArmy);
        } else if (a >= 1 && a <= 19) {
            System.out.println(pack);
        } else if (a >= 20 && a < 250) {
            System.out.println(throng);
        } else if (a >= 250 && a < 1000) {
            System.out.println(zounds);
        } else if (a >= 1000) {
            System.out.println(legion);
        }
    }
}