package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File fileReader = new File("code.txt");
        try {
            Scanner scanner = new Scanner(fileReader);
            if (fileReader.length() > 100) {
                throw new IllegalStateException("Код слишком большой!");
            } else {
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
        write();
    }

    static void write() throws IOException {
        FileReader fileReader = new FileReader("code.txt");
        Scanner scanner = new Scanner(fileReader);
        String str = "";
        String str2 = "";
        while (scanner.hasNextLine()) {
            str += scanner.nextLine() + "\n";
        }
        fileReader.close();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') continue;
            str2 += str.charAt(i);
        }
        FileWriter fileWriter = new FileWriter("codeWithoutBLank.txt");
        fileWriter.write(str2);
        fileWriter.close();
    }
}
