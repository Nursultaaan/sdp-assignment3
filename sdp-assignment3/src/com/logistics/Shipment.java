package com.logistics;

public abstract class Shipment {
    protected DeliveryCarrier carrier;

    public Shipment(DeliveryCarrier carrier) {
        this.carrier = carrier;
    }

    public  void SetCarrier(DeliveryCarrier carrier) {
        this.carrier = carrier;
    }

    public abstract void send(String item);
}
