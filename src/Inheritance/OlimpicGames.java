package Inheritance;

import java.time.LocalDate;

public class OlimpicGames {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        System.out.println("Добро пожаловать на олимпийские игры " + currentYear);
        Footballer messi = new Footballer("Месси", "Аргентина", 37);
        Footballer arshavin = new Footballer("Аршавин", "Россия", 43);
        HockeyPlayer ovechkin = new HockeyPlayer("Овечкин", "США", 38, "Нападающий");
        HockeyPlayer nikolaev = new HockeyPlayer("Николаев", "Россия", 24, "Вратарь");
        Skier orlova = new Skier("Анна Орлова", "Россия", 34);
        Skier moga = new Skier("Абел Мога", "Испания", 23);

        System.out.println("Представляем вам спортсменов");

        messi.introduce();
        arshavin.introduce();
        ovechkin.introduce();
        nikolaev.introduce();
        orlova.introduce();
        moga.introduce();

        for (int i = 0; i < 5; i++) {
            messi.goal();
        }
        messi.GoalsPerMatch();

        for (int i = 0; i < 2; i++) {
            arshavin.goal();
        }
        arshavin.GoalsPerMatch();

        for (int i = 0; i < 7; i++) {
            ovechkin.goal();
        }
        ovechkin.GoalsPerMatch();
        ovechkin.startFight();

        nikolaev.startFight();

        orlova.startRide();
        orlova.endRide();

        moga.startRide();
        moga.startRide();
        moga.endRide();

    }
}
