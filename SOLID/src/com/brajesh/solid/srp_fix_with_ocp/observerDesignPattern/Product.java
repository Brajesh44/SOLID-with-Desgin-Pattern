package com.brajesh.solid.srp_fix_with_ocp.observerDesignPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Product implements Subject{

    private String productName;

    private  boolean available;

    private List<Observer> listOfObserver = new ArrayList<>();


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
         this.available=available;
       Optional.of(available)
               .filter(Boolean::booleanValue).
               ifPresentOrElse(a->notifyObservers(),()->System.out.println("Product is not available"));

    }

    public List<Observer> getListOfObserver() {
        return listOfObserver;
    }

    public void setListOfObserver(List<Observer> listOfObserver) {
        this.listOfObserver = listOfObserver;
    }

    @Override
    public void addObserver(Observer observer) {
          listOfObserver.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
          listOfObserver.remove(observer);
    }

    @Override
    public void notifyObservers() {
        listOfObserver.forEach(observer -> observer.update(productName));
    }


}
