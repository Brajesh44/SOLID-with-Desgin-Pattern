package com.brajesh.solid.srp_fix_with_ocp.ObserverStrategySendNotification;

import java.util.List;

public class Customers  implements OSObserver{
    private String customerName;
    private String email;
    private String phoneNumber;
    private final List<NotificationStrategy> notificationStrategies;


    public Customers(String customerName, String email, String phoneNumber, List<NotificationStrategy> notificationStrategies) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.notificationStrategies = notificationStrategies;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<NotificationStrategy> getNotificationStrategies() {
        return notificationStrategies;
    }

    @Override
    public void update(String message) {
        notificationStrategies
                .forEach(c->c.send(" Hello " +customerName+ ", "+message,this));
    }
}
