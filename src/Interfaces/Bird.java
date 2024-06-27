package Interfaces;

public class Bird implements Flyable, Swimmable {
    private String name;
    private String type;
    private int age;
    private final String[] notFlyableBirds = {"страус", "пингвин", "киви", "эму"};

    public Bird(String type, int age) {
        this.type = type;
        this.age = age;

    }

    private String nameOrType() {
        return (name == null || name.isBlank()) ? type : name;}

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        for (String entry : notFlyableBirds) {
            if (type.toLowerCase().equals(entry)) {
                System.out.println(nameOrType() + " не умеет летать, в отличии от большинства вида птиц.");
                return;
            }
        }
        System.out.println(nameOrType() + " умеет летать.");
    }

    @Override
    public void swim() {
        System.out.println(nameOrType() + " может плавать или охотиться в воде.");

    }


}
