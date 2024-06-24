package Inheritance;

public class HockeyPlayer extends Footballer {
    String type;

    public HockeyPlayer(String name, String team, int age, String type) {
        super(name, team, age);
        this.type = type;
    }

    public void startFight() {
        System.out.println(super.getName() + " начал драку");
    }

    @Override
    public String toString() {
        return ("Хоккеист " + super.getName() + " возрастом " + super.getAge() + " лет. Выступает за команду "
                + getTeam() + ". Играет на позиции " + type);
    }
}
