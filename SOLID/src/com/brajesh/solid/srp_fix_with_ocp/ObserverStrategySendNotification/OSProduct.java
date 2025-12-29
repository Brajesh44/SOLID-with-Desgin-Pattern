package com.brajesh.solid.srp_fix_with_ocp.ObserverStrategySendNotification;

import java.util.ArrayList;
import java.util.List;

public class OSProduct implements OSSubject{


    private final String productName;
    private boolean available;

    private final List<OSObserver> osObserverList= new ArrayList<>();


    public OSProduct(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean newAvailability) {
        if (!this.available && newAvailability) {
            this.available = true;
            notifyObservers(productName + " is now AVAILABLE!");
            return;
        }
        this.available = false;
        System.out.println(productName+ " is out of stock, available shortly");


    }

    @Override
    public void addObserver(OSObserver observer) {
        osObserverList.add(observer);
    }

    @Override
    public void removeObserver(OSObserver observer) {
     osObserverList.remove(observer);
    }

    private void notifyObservers(String message) {
        osObserverList.forEach(o -> o.update(message));
    }
}
