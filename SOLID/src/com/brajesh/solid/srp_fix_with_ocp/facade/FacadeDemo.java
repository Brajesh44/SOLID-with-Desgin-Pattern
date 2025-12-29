package com.brajesh.solid.srp_fix_with_ocp.facade;


import java.util.List;

public class FacadeDemo {

    static void main() {

        PaymentRegistry paymentRegistry= new PaymentRegistry(List.of(new CardPayment(),new UPIPayment()));
        FacadePayment facadePayment= new FacadePayment(paymentRegistry);
        facadePayment.makePayment("CARD");
    }

}
