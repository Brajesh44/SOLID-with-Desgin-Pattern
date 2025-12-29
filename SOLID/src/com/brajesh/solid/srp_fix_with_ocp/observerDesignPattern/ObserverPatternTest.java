package com.brajesh.solid.srp_fix_with_ocp.observerDesignPattern;

public class ObserverPatternTest {

    static void main() {
        Customer customer1= new Customer();
        customer1.setCustomerName("Dinesh");

        Customer customer2= new Customer();
        customer2.setCustomerName("Vijay");

        Product iPhone6= new Product();
        iPhone6.setProductName("Apple iPhone 6");
       // iPhone6.setAvailable(false);
        iPhone6.addObserver(customer1);
        iPhone6.addObserver(customer2);
        iPhone6.setAvailable(true);
    }
}
