package AnonymusClassesFunctionalInterfaces;

public class task1 {
    public static void main(String[] args) {
        Printable elementOne = new Printable() {
            @Override
            public void print() {
                System.out.println("Вывод строки из элемента один");
            }
        };

        Printable elementTwo = new Printable() {
            @Override
            public void print() {
                System.out.println("Это метод print() второго элемента");
            }
        };

        Printable elementThree = new Printable() {
            @Override
            public void print() {
                System.out.println("Третья реализация метода print() функционального интерфейса Printable");
            }
        };

        elementOne.print();
        elementTwo.print();
        elementThree.print();


    }


}

@FunctionalInterface
interface Printable {
    void print();
}
