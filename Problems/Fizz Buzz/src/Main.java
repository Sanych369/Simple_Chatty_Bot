import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for (; start <= end; start++) {
            System.out.println(
                    start % 3 == 0 && start % 5 == 0 ? "FizzBuzz"
                            : start % 3 == 0 ? "Fizz"
                            : start % 5 == 0 ? "Buzz" : String.valueOf(start));
        }
    }
}