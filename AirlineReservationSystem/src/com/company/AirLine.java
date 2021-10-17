package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AirLine {
    private String name="Air Blue";
    List<Seats> seats=new LinkedList<>();
    public AirLine(String name, String capacity, String destination, int number_rows, int seat_per_coloumn) {
        this.name = name;
        int lastlow='A'+(number_rows-1);
        for (char row='A';row<=lastlow;row++){
            for (int seatnum=1;seatnum<=seat_per_coloumn;seatnum++){
                Seats seat=new Seats(row+String.format("%02d",seatnum));
                seats.add(seat);
            }

        }
    }
    public boolean reseveseat(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("which seat you want to reserve");
        String seatnumber=scanner.nextLine();
        Seats request=null;
        for (Seats seat:seats){
            System.out.println(".");
            if (seat.getSeat_to_reserve().equals(seatnumber)){
                request=seat;
                System.out.println("seat reserved");
                break;
            }
        }
        if (request==null){
            System.out.println("there is no seat");
            return false;
        }
        return request;
    }

}
