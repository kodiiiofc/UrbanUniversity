package ClassMembersConstructorsMethods;

public class Calculator {
    public int a;
    public int b;

    public int sum(int a, int b) {
        return (a + b);
    }

    public int diff(int a, int b) {
        return (a - b);
    }

    public void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public void divide(int a, int b) {
        System.out.println(a / b);
    }

}
