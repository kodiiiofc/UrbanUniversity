package IfSwitchReturn;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        if (a % 2 == b % 2) {
            System.out.println("Удачное совпадение");
        }
    }
}
