package Inheritance;

public class Sportsman {
    private String name;
    private String team;
    private int age;

    public Sportsman(String name, String team, int age) {
        this.name = name;
        this.team = team;
        if (age >= 0 && age <= 100) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return ("Спортсмен " + name + " возрастом " + age + " лет. Выступает за команду " + team);
    }

    public void introduce() {
        System.out.println(this.toString());
    }

}
