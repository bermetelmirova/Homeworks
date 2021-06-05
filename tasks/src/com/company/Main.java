package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        taskA();
        taskB();
    }

    public static void taskA() throws IOException {
        FileReader fileReader = new FileReader("Song.txt");
        Scanner scanner = new Scanner(fileReader);
        String name = "";
        String artist = "";
        String genre = "";
        String lyrics = "";
        int i = 1;
        while (scanner.hasNextLine()) {
            if (i == 1) {
                name = scanner.nextLine();
            } else if (i == 2) {
                artist = scanner.nextLine();
            } else if (i == 3) {
                genre = scanner.nextLine();
            } else
                lyrics += scanner.nextLine() + "\n";
            i++;
        }
        fileReader.close();
        Song song = new Song(name, artist, genre, lyrics);
        System.out.println(song);
    }
    public static void taskB() throws IOException {
        FileWriter fileWriter = new FileWriter("Song2.txt");
        Song song = new Song("everything i wanted", "Billie Eilish", "Ballad", "I had a dream\nI got everything i wanted\nNot what you think\nAnd if I'm being honest\n");
        fileWriter.write(String.valueOf(song));
        fileWriter.close();
    }
}
