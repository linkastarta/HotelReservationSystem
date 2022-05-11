package com.mycompany.hotelmain;

public class Customer {
    private String customerName;
    private String phoneNumber; 
    private int Adult; 
    private int Children_Senior; 
    private String qualityPreference;
    private String bedTypePreference;

    public Customer(String customerName,  String phoneNumber, int Adult, int Children_Senior, String qualityPreference, String bedTypePreference){
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.Adult = Adult;
        this.Children_Senior = Children_Senior;
        this.qualityPreference = qualityPreference;
        this.bedTypePreference = bedTypePreference;
    }

    public String getCustomerName(){
        return customerName;
    }

    public int getChildren_Senior(){
        return Children_Senior;
    }

    public int getAdult(){
        return Adult;
    }

    public String getQualPref(){
        return qualityPreference;
    }
    public String getBedTypePref(){
        return bedTypePreference;
    }
    public String getPhoneNumber() {return phoneNumber;}
}