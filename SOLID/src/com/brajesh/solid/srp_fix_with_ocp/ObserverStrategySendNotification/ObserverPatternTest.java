package com.brajesh.solid.srp_fix_with_ocp.ObserverStrategySendNotification;


import java.util.List;

public class ObserverPatternTest {

    static void main() throws InterruptedException {
        List<NotificationStrategy> emailAndSms =
                List.of(new EmailNotification(), new SmsNotification());
        Customers Roma =
                new Customers("Roma", "niharikan305@gmail.com", "7703993850",
                        emailAndSms );

        Customers Tinkoo =
                new Customers("Tinkoo", "brajesh.gauta2@gmail.com", "9818149596",
                        emailAndSms);

        OSProduct iphone = new OSProduct("Apple iPhone 6");

        iphone.addObserver(Roma);
        iphone.addObserver(Tinkoo);

        iphone.setAvailable(false);
        Thread.sleep(10000);
        iphone.setAvailable(true);
        iphone.removeObserver(Tinkoo);
        Thread.sleep(10000);
        iphone.setAvailable(false);
        iphone.setAvailable(true);
    }
}
