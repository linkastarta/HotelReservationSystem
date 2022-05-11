package com.mycompany.hotelmain;

public class Reservation {
    private Room room;
    private Customer customer;
    private String reservationNumber;
    private int checkInDays;
    private double TotalCost;

    public Reservation(Room room, Customer customer, String reservationNumber, int checkInDays, double TotalCost){
        this.customer = customer;
        this.reservationNumber = reservationNumber;
        this.checkInDays = checkInDays;
        this.TotalCost = TotalCost;
        this.room=room;
    }

    public int getDays(){
        return checkInDays;
    }

    public void setPrice(Double price){
        TotalCost = price;
    }

    public Room getRoom(){
        return room;
    }
     public Customer getCustomer(){
        return customer;
     }

     public double getTotalCost(){
        return TotalCost;
     }

    public void Extend(int ExtendedDays){
        checkInDays = ExtendedDays + checkInDays;
    }

    public String toString()
    {
        return String.format("Reservation number: %s\nCustomer Name: %s\nCheck In Days: %d\nTotal Cost: %.2f\n", reservationNumber, customer.getCustomerName(), checkInDays, getTotalCost());
    }
    
    public String getReservationNumber()
    {
        return reservationNumber;
    }
}