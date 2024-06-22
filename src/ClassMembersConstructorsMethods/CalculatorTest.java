package ClassMembersConstructorsMethods;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(312, 3351));
        System.out.println(calculator.diff(10, 3));
        calculator.divide(200, 5);
        calculator.multiply(3,7);
    }
}
