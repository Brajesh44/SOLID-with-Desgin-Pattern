package com.brajesh.solid.srp_fix_with_ocp.ObserverStrategySendNotification;



public interface NotificationStrategy {

    void send(String message, Customers customer);
}
