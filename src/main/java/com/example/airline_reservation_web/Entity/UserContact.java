package com.example.airline_reservation_web.Entity;

public class UserContact {
    private String phone_number;
    private String address;

    public UserContact(String phone_number, String address) {
        this.phone_number = phone_number;
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
