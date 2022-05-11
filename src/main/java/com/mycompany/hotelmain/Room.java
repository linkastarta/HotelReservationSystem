package com.mycompany.hotelmain;

public class Room {
    
    private boolean Reserved; 
    private String roomQuality; 
    private String bedType; 
    private String roomnumber;

    public Room (String Roomnumber, boolean Reserved, String roomQuality, String bedType){
        this.roomnumber = Roomnumber;
        this.Reserved = Reserved;
        this.roomQuality = roomQuality;
        this.bedType = bedType;
    }

    public String getRoomQuality(){
        return roomQuality;
    }
    public String getbedType(){
        return bedType;
    }

    public boolean isReserved(){
        return Reserved;
    }
    public void reserve()
    {
        this.Reserved = !this.Reserved;
    }

    public double RoomCost(){
        if(roomQuality == "Standard"){
            return 1000;
        }
        if(roomQuality == "Deluxe"){
            return 3500;
        }
        if(roomQuality == "Premium"){
            return 5000;
        }
        return 0;
    }

    public String getRoomnumber()
    {
        return roomnumber;
    }



    public double BedCost(){
        if(bedType == "Single"){
            return 500;
        }
        if(bedType == "Double"){
            return 1000;
        }
        return 0;
    }
}