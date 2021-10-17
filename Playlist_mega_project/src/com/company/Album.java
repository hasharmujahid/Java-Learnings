package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Album {
    private ArrayList<String> songs;
    private String name;
    private String Artistname;

    public Album(ArrayList<String> songs, String name, String artistname) {
        this.songs = songs;
        this.name = name;
        Artistname = artistname;
    }

    public void addsong(){
        Scanner scanner=new Scanner(System.in);
        String song_name=scanner.nextLine();
       if (songs.contains(song_name)){
           System.out.println("song is alredy present ");
       }
       else {

           songs.add(song_name);
           System.out.println("song is added in album");
       }
    }
    public void removesong(){
        Scanner scanner=new Scanner(System.in);
        String song_name=scanner.nextLine();
        if (songs.contains(song_name)){
            songs.remove(song_name);
            System.out.println("song is removed from albums");
        }
        else {
            System.out.println("song is not present in play list");
        }

    }
}
