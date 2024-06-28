package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = "src/File/";
        String docName = "document.txt";

        File file = new File(path, docName);
        FileWriter writer = new FileWriter(file);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные для записи");

        String input = scanner.nextLine();

        while (!input.equals("0")) {
            writer.write(input + "\n");
            System.out.println("Введите что-нибудь еще");
            input = scanner.nextLine();
        }

        writer.close();

        System.out.println("Файл создан");


    }


}

