package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите название файла: ");
        String nameOfFile = scanner.nextLine();
        System.out.print("Введите расширение файла: ");
        String nameOfType = scanner.nextLine();
        System.out.println("Результат: " + fileExtension(nameOfFile, nameOfType));
        String file = fileExtension(nameOfFile, nameOfType);

        System.out.println(file.split("  "));
    }

    static String fileExtension(String filename, String fileType) {
        if (!filename.contains(".")) {
            filename = filename + "." + fileType;
            return filename;
        } else {
            int index = filename.lastIndexOf(".");
            String oldType = filename.substring(index + 1, filename.length());
            filename = filename.replace(oldType, fileType);
            return filename;
        }
    }
}
