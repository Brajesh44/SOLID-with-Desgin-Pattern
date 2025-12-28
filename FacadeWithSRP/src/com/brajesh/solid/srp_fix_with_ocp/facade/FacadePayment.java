package com.brajesh.solid.srp_fix_with_ocp.facade;


public class FacadePayment {

private PaymentRegistry paymentRegistry;

    public FacadePayment(PaymentRegistry paymentRegistry) {
        this.paymentRegistry = paymentRegistry;
    }
    public void makePayment(String paymentType){
        paymentRegistry.getPayment(paymentType).pay();
    }
}
