package Abstraction.task2;

public abstract class Bird {
    private int flySpeed;

    protected Bird() {
    }

    public void setFlySpeed(int flySpeed) {
        this.flySpeed = flySpeed;
    }

    public int getFlySpeed() {
        return flySpeed;
    }

    public abstract void fly();

    public abstract void makeSound();

}
