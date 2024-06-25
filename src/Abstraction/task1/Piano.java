package Abstraction.task1;

import java.util.Scanner;

public class Piano extends Instrument {

    private static final String TUNE_1 = "квинто-квартовая (кварто-квинтовая)";
    private static final String TUNE_2 = "терц-секст";
    private static final String OUT_TUNE = "Выбрана %s настройка системы фортепиано";

    @Override
    public void tune() {
        System.out.println("Выберите строй фортепиано: \n" +
                "1 - квинто-квартовая (кварто-квинтовая) \n" +
                "2 - терц-секст");
        Scanner scanner = new Scanner(System.in);
        int tuneNumber = 0;
        do {
            System.out.println("Введите число 1 или 2: ");
            if (scanner.hasNextInt()) {
                tuneNumber = scanner.nextInt();
                if (tuneNumber == 1) {
                    System.out.printf(OUT_TUNE, TUNE_1);
                    System.out.println();
                    break;
                } else if (tuneNumber == 2) {
                    System.out.printf(OUT_TUNE, TUNE_2);
                    System.out.println();
                    break;
                }
                else {}
            }
            scanner.nextLine();
        }
        while (true);
    }

    @Override
    public void play() {
        System.out.println("Укажите название композиции.");
        Scanner scanner = new Scanner(System.in);
        String song = scanner.nextLine();
        System.out.println("Сейчас играет " + song);


    }
}
