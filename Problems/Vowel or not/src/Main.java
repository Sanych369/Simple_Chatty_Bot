import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        String str = String.valueOf(ch);
        switch (str.toLowerCase()) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
//            case ("y"):
                return true;
            default:
                return false;
        } // write your code here
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}