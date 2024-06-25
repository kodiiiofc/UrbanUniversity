package Abstraction.task1;

public class Main {

    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        guitar.tune();
        guitar.play();
        piano.tune();
        piano.play();

    }
}
