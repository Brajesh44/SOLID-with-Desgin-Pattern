package com.brajesh.solid.srp_fix_with_ocp.ObserverStrategySendNotification;

public class SmsNotification implements NotificationStrategy{
    @Override
    public void send(String message, Customers customer) {
        System.out.println("Sending SMS to Phone number " +customer.getPhoneNumber()+": "+message);
    }
}
