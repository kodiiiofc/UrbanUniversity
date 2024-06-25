package Abstraction.task1;

import java.util.Scanner;

public class Guitar extends Instrument {

    @Override
    public void tune() {
        System.out.println("Введите строй гитары (6 нот латиницей без пробелов, первой струне \n" +
                "соответствует крайний правый символ (стандартный строй EADGBE).");
        String notes = "[CDEFGABcdefgab]";
        StringBuilder regexSB = new StringBuilder(notes);
        String regex = regexSB.repeat(notes, 5).toString();
        Scanner scanner = new Scanner(System.in);
        String tune = scanner.nextLine();
        while (true) {
            if (tune.matches(regex)) {
                System.out.println("Выбран строй гитары " + tune.toUpperCase());
                setTune(tune);
                break;
            } else {
                System.out.println("Введите корректный строй");
                tune = scanner.nextLine();
            }
        }
    }

    @Override
    public void play() {
        System.out.println("Укажите название песни.");
        Scanner scanner = new Scanner(System.in);
        String song = scanner.nextLine();
        System.out.println("Сейчас играет " + song);


    }
}
