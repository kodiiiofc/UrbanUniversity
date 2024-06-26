package Abstraction.task2;

public class Eagle extends Bird {

    public Eagle() {
        super.setFlySpeed(30);
    }

    @Override
    public void fly() {
        System.out.println("Орел летит со срендней скоростью до " + super.getFlySpeed() + " м/c");
    }

    @Override
    public void makeSound() {
        System.out.println("Орел кричит");
    }
}
