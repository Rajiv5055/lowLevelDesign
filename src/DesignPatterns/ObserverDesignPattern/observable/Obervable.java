package DesignPatterns.ObserverDesignPattern.observable;

import DesignPatterns.ObserverDesignPattern.observer.Observer;

public interface Obervable {

    void add(Observer oberver);
    void remove(Observer observer);
    void notifyObervers(int quantity);
    void setItemQuantity(int quantity);
    int getQuantity();
    String getItemName();
}
