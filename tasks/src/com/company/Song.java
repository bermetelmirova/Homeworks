package com.company;

public class Song {
    private String name;
    private String artist;
    private String genre;
    private String lyrics;

    public Song(String name, String artist, String genre, String lyrics) {
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.lyrics = lyrics;
    }

    @Override
    public String toString() {
        return "Name: " + name +  "\nArtist: " + artist  + "\nGenre: " + genre +" \nLyrics:\n" + lyrics;
    }
}
