package DesignPatterns.MediatorDesignPattern;

public interface Colleague {
    void placeBid(Long bidAmount);
    void receiveNotification(Long bidAmount);
    String getName();
}
