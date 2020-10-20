//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String[] strings = new String[8];
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            for (int i = 0; i < strings.length; i++) {
                strings[i] = scanner.next();
            }
        }
        for (int i = strings.length - 1; i >= 0; i--) {
            System.out.println(strings[i]);
        }
    }
}