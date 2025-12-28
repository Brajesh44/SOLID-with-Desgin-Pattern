package com.brajesh.solid.srp_fix_with_ocp.facade;

public class UPIPayment implements Payment {

    @Override
    public String paymentType() {
        return "UPI";
    }

    @Override
    public void pay() {
        verifyUPI();
        transferMoney();
    }
    void verifyUPI(){
        System.out.println("UPI verified");
    }

    void transferMoney(){
        System.out.println("Money is transfer from UPI");
    }


}
