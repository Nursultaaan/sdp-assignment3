package com.logistics;

public class ExpressParcel extends Shipment {
    public ExpressParcel(DeliveryCarrier carrier) {
        super(carrier);
    }

    @Override
    public void send(String item) {
        System.out.println("Express delivery");
        carrier.deliver(item);
    }
}
