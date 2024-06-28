package Exception;

public class ExceptionTask {
    public static void main(String[] args) throws Exception {

        String s1 = "Привет";
        String s2 = "Прив3т";

        int n1 = 4;
        int n2 = 6;

        System.out.println(isEven(4));

        System.out.println(withoutNumbers(s1));

        System.out.println(isEven(n2));

        System.out.println(withoutNumbers(s2));

    }

    public static int isEven(int number) {
        if (number % 2 != 0) {
            throw new ArithmeticException("Число должно быть четным");
        }
        return number;
    }

    public static String withoutNumbers(String string) throws Exception {
        String regex = ".+[0123456789]+.";
        if (string.matches(regex)) {
            throw new Exception("Текст содержит число");
        }
        return string;
    }

}
