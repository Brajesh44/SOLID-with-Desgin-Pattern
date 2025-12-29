package com.brajesh.solid.srp_fix_with_ocp.observerDesignPattern;

public interface Subject {

    void addObserver (Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
