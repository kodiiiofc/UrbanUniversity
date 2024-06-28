package Exception;

import java.util.Scanner;

public class ExceptionTask {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        while (true) {
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("Число " + isEven(number) + " четное");
        }
        else {
            String string = scanner.nextLine();
            System.out.println("В строке " + withoutNumbers(string) + " цифр нет");
        }}

    }

    public static int isEven(int number) {
        if (number % 2 != 0) {
            throw new ArithmeticException("Число должно быть четным");
        }
        return number;
    }

    public static String withoutNumbers(String string) throws Exception {
        String regex = ".*\\d+.*";
        if (string.matches(regex)) {
            throw new Exception("Текст содержит число");
        }
        return string;
    }

}
