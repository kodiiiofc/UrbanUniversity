package Interfaces;

public class Human implements Swimmable, Flyable {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public void swim() {
        System.out.println(name + " может плавать с помощью транспорта, а также самостоятельно,\n" +
                "но навык плавания приобретаемый, а не врожденный");

    }

    @Override
    public void fly() {
        System.out.println(name + " может летать с помощью вспомогательных средств или транспорта.");
    }
}
