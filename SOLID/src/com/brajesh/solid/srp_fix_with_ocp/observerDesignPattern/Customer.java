package com.brajesh.solid.srp_fix_with_ocp.observerDesignPattern;

public class Customer implements Observer{


    private String customerName;
    private Subject subject;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void update(String productName) {
        System.out.println("Hello "+ customerName +", " + productName +" is available on Amazon");
    }
}
