package com.company;

import java.util.LinkedList;
import java.util.List;

public abstract class Planes {
private String name;
private String capacity;
private String destination;
    List<Seats> seats=new LinkedList<>();
    public Planes(String name, String capacity, String destination, int number_rows, int seat_per_coloumn) {
        this.name = name;
        this.capacity = capacity;
        this.destination = destination;

        int lastlow='A'+(number_rows-1);
        for (char row='A';row<=lastlow;row++){
            for (int seatnum=1;seatnum<=seat_per_coloumn;seatnum++){
                Seats seat=new Seats(row+String.format("%02d",seatnum));
                seats.add(seat);
    }

        }
    }



}
