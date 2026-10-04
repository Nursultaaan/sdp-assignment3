package com.logistics;

public class Main {
    public static void main(String[] args) {
        DeliveryCarrier dhl = new DhlCarrier();
        DeliveryCarrier ups = new UpsCarrier();

        Shipment parcel = new StandardParcel(dhl);
        parcel.send("Book");

        parcel.setCarrier(ups);
        parcel.send("Book");

        Shipment express = new ExpressParcel(ups);
        express.send("Laptop");

    }
}