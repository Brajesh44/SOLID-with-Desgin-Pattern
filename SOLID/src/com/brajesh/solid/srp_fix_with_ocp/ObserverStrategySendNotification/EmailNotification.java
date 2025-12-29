package com.brajesh.solid.srp_fix_with_ocp.ObserverStrategySendNotification;

public class EmailNotification implements NotificationStrategy{
    @Override
    public void send(String message, Customers customer) {
        System.out.println("Sending EMAIL to " +customer.getEmail()+": "+message);
    }
}
