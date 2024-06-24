package Inheritance;

public class Skier extends Sportsman {
    boolean inRide = false;

    public Skier(String name, String team, int age) {
        super(name, team, age);
    }

    public void startRide() {
        if (!inRide) {
            System.out.println(super.getName() + " начал заезд!");
            inRide = true;
        }
        else {
            System.out.println(super.getName() + " сейчас на трассе");
        }
    }

    public void endRide() {
        if (inRide) {
            System.out.println(super.getName() + " завершил заезд!");
            inRide = false;
        }
        else {
            System.out.println("Закончить заезд может только тот, кто его уже начал");
        }
    }

}
