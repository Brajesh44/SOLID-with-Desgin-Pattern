package com.brajesh.solid.srp_fix_with_ocp.facade;

public class CardPayment implements Payment {

    @Override
    public String paymentType() {
        return "CARD";
    }

    @Override
    public void pay() {
        validateCard();
        debitCard();
    }

    void validateCard(){
        System.out.println("Card is validated");
    }

    void debitCard(){
        System.out.println("Amount debited from card");
    }



}
