package com.threads.basics;

public class Booking {
    public double boolTickets(String name, int noOfTickets){
        double costPerTicket =200;
        System.out.println("booked for"+name);
        double totalPrice =costPerTicket*noOfTickets;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Total"+totalPrice);
        return totalPrice;
    }

}
