package com.mycompany.hotelmain;

import java.util.ArrayList;

public final class hotelAndLogs {
    private static Room [] Hotel;
    private static ArrayList<Reservation> reservations;
    private static ArrayList<Reservation> history;
    private static ArrayList<Reservation> checkIns;
    
    public static Room [] getHotel()
            {
                return Hotel;
            }
    public static ArrayList<Reservation> getReservations()
    {
        return reservations;
    }
    public static ArrayList<Reservation> getHistory()
    {
        return history;
    }
    public static ArrayList<Reservation> getCheckIns()
    {
        return checkIns;
    }
    
    public void setHotel(Room [] hotel)
    {
        Hotel = hotel;
    }
    public void setReservations(ArrayList<Reservation> reservation)
    {
        reservations = reservation;
    }
    public void setHistory (ArrayList<Reservation> History)
    {
        history = History;
    }
    public void setCheckIns (ArrayList<Reservation> checkins)
    {
        checkIns = checkins;
    }
}

