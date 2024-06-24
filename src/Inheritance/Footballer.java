package Inheritance;

public class Footballer extends Sportsman {

    private int goals;

    public Footballer(String name, String team, int age) {
        super(name, team, age);
    }

    public void newMatch() {
        goals = 0;
    }

    public void goal() {
        goals++;
    }

    public void GoalsPerMatch() {
        System.out.println("В текущем матче " + super.getName() + " забил " + goals + " голов!");
    }
}
