package com.logistics;

public class StandardParcel extends Shipment {
    public StandardParcel(DeliveryCarrier carrier) {
        super(carrier);
    }

    @Override
    public void send(String item) {
        System.out.println("Standard Delivery: ");
        carrier.deliver(item);
    }
}
