package com.logistics;

public abstract class Shipment {
    protected DeliveryCarrirer carrier;

    public Shipment(DeliveryCarrirer carrier) {
        this.carrier = carrier;
    }

    public  void SetCarrier(DeliveryCarrirer carrier) {
        this.carrier = carrier;
    }

    public abstract void send(String item);
}
