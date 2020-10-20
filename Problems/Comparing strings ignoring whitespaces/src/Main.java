import java.util.Scanner;

class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str1 = scanner.nextLine().replace(" ", "");
//        String str2 = scanner.nextLine().replace(" ", "");
//        System.out.println(str1.equals(str2));
        String str = "a simple string";

        str = str.replace("a", "A SIMPLE").substring(2, 8);
        System.out.println(str);
    }
}