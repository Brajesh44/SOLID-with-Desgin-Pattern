package com.brajesh.solid.srp_fix_with_ocp.facade;

public class WalletPayment implements Payment {


    @Override
    public String paymentType() {
        return "WALLET";
    }

    @Override
    public void pay() {
        checkBalance();
        payUsingWallet();
    }


    void checkBalance(){
        System.out.println("wallet balance checked ");
    }

    void payUsingWallet(){
        System.out.println("Paid using Wallet");
    }


}
