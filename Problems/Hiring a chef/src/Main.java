//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        scanner.nextInt();
        scanner.next();
        scanner.nextInt();
        String preference = scanner.next();
        System.out.printf("" +
                "The form for %s is completed." +
                " We will contact you if we need a chef that cooks %s dishes.",
                firstName, preference);
    }
}