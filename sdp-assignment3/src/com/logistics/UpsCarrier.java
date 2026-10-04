package com.logistics;

public class UpsCarrier implements DeliveryCarrirer {
    @Override
    public  void deliver(String item) {
        System.out.println("UPS Delivering " + item + " by truck");
    }
}
