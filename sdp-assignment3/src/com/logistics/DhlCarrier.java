package com.logistics;

public class DhlCarrier implements  DeliveryCarrirer {
    @Override
    public void deliver(String item) {
        System.out.println("DHL Delivering " + item + " by air");
    }
}
