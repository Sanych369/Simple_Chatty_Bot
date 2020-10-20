import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int foodPrice = scanner.nextInt() * days;
        int way = scanner.nextInt() * 2;
        int hotel = scanner.nextInt() * (days - 1);
        System.out.println(foodPrice + way + hotel);
    }
}