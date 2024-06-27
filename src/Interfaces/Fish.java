package Interfaces;

public class Fish implements Swimmable {
    private String type;
    private String name;
    private int age;

    public Fish(String type, int age) {
        this.type = type;
        this.age = age;

    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(((name == null || name.isBlank()) ? type : name) + " умеет плавать. Это способ перемещения в среде обитания.");

    }

}
