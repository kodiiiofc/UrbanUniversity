package AnonymusClassesFunctionalInterfaces;

public class task2 {
    public static void main(String[] args) {
        Concationble concatOne = new Concationble() {
            @Override
            public String concat(String stringOne, String stringTwo) {
                return stringOne + stringTwo;
            }
        };
        Concationble concatTwo = new Concationble() {
            @Override
            public String concat(String stringOne, String stringTwo) {
                return stringTwo + stringOne;
            }
        };
        Concationble concatThree = new Concationble() {
            @Override
            public String concat(String stringOne, String stringTwo) {
                return stringOne + " " + stringTwo;
            }
        };

        Concationble concatFour = new Concationble() {
            @Override
            public String concat(String stringOne, String stringTwo) {
                return stringOne + ", " + stringTwo + "!";
            }
        };

        String hello = "Hello";
        String world = "world";

        System.out.println(concatOne.concat(hello, world));
        System.out.println(concatTwo.concat(hello, world));
        System.out.println(concatThree.concat(hello, world));
        System.out.println(concatFour.concat(hello, world));



    }
}

interface Concationble {
    String concat(String stringOne, String stringTwo);
}
