package com.logistics;

public class UpsCarrier implements DeliveryCarrier {
    @Override
    public  void deliver(String item) {
        System.out.println("UPS Delivering " + item + " by truck");
    }
}
