package com.company;

import java.util.Scanner;

    public class Seats {
    private String seat_to_reserve;
    private boolean reserved ;
    Scanner scanner=new Scanner(System.in);
        public boolean reservation(){
            if (!reserved){
                System.out.println("seat is alavliable if you want to reserve it press 'enter'");
                scanner.nextLine();
                reserved =true;
                System.out.println("seat ");
                return true;
            }else System.out.println("seat is already reserve ");
            return false;

        }


        public String getSeat_to_reserve() {
            return seat_to_reserve;
        }

        public Seats(String seat_to_reserve) {
            this.seat_to_reserve = seat_to_reserve;
        }

        public boolean cancle_reservation(){
            System.out.println("do you want to cencle the reservation");
            String str=scanner.nextLine().toLowerCase();
            if (str=="yes"){
                System.out.println("processing");
                reserved =false;
                System.out.println("seat rerservation is cenceled");
                return true;
            }else return false;
        }

    }
