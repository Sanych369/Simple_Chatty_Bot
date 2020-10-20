import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); //высота
        int b = scanner.nextInt(); //подъем днём
        int c = scanner.nextInt(); //спуск ночью
        int d = 0;
        int day = 0; //кол-во дней, когда доползёт
        while (d < a) {
            if (b + d >= a) {
                day++;
                System.out.println(day);
                break;
            }
            day++;
            d += b - c;
        }
    }
}