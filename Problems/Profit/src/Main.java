import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextInt();
        double p = scanner.nextDouble() / 100;
        double k = scanner.nextInt();
        int res = 0;
        while (m < k) {
            m = m + (m * p);
            res++;
        }
        System.out.println(res);
    }
}