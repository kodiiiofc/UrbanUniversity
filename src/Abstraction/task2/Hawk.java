package Abstraction.task2;

public class Hawk extends Bird {

    public Hawk() {
        super.setFlySpeed(23);
    }

    @Override
    public void fly() {
        System.out.println("Сокол летит со срендней скоростью до " + super.getFlySpeed() + " м/c");
    }

    @Override
    public void makeSound() {
        System.out.println("Сокол кричит");
    }
}
