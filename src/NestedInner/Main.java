package NestedInner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car("Лада", 160, 900);
        car.getCarBrand();
        car.getSpeed();
        car.getWeight();

        car.engine.fuel.check();
        car.engine.piston1.check();
        car.engine.piston2.check();
        car.engine.fuel.toFillUp();
        car.engine.fuel.check();

        car.engine.startEngine();

        Thread.sleep(1000 * 60 * 2);

        car.engine.stopEngine();
        car.engine.fuel.check();
        car.engine.piston1.check();
        car.engine.piston2.check();
        car.engine.fuel.toFillUp();
        car.engine.fuel.check();


    }
}
