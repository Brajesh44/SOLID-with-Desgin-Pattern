package com.brajesh.solid.srp_fix_with_ocp.ObserverStrategySendNotification;

public interface OSSubject {

    void addObserver(OSObserver observer);
    void removeObserver(OSObserver observer);
}