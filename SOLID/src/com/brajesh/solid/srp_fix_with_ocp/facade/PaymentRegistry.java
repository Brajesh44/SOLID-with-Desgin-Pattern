package com.brajesh.solid.srp_fix_with_ocp.facade;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PaymentRegistry {

    private final Map<String,Payment> paymentMap ;

    public PaymentRegistry(List<? extends Payment> paymentList) {
       this.paymentMap=paymentList
               .stream()
               .collect(Collectors.toMap(Payment::paymentType,payment -> payment));
    }

    public Payment getPayment(String paymentType){

        return  paymentMap
                .entrySet()
                .stream()
                .filter(entry->entry.getKey().equalsIgnoreCase(paymentType))
                .map(Map.Entry::getValue)
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("Invalid Payment Type"));

    }
}
