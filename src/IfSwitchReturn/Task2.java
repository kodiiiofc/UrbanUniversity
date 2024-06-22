package IfSwitchReturn;

import java.util.Scanner;

public class Task2 {
    public static final String OUTPUT = "Число попадает %s декаду месяца";
    public static final String OUT_OF_RANGE = "Такого числа не бывает в месяце";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayOfMonth = scanner.nextInt();
        scanner.close();
        String decade;
        if (dayOfMonth > 0 && dayOfMonth < 32) {
            if (dayOfMonth < 11) {
                decade = "в первую";
            }
            else if (dayOfMonth > 20) {
                decade = "в третью";
            }
            else {
                decade = "во вторую";
            }
        }
        else {
            System.out.println(OUT_OF_RANGE);
            return;
        }
        System.out.printf(OUTPUT, decade);
    }
}
