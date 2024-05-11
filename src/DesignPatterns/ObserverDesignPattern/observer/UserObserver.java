package DesignPatterns.ObserverDesignPattern.observer;


import DesignPatterns.ObserverDesignPattern.observable.Obervable;

import java.util.Observable;

public class UserObserver implements Observer{

    private String userName;

    private Obervable obervable;

    public UserObserver(String userName, Obervable obervable){
        this.userName = userName;
        this.obervable = obervable;
    }
//    @Override
//    public void update(Obervable obervable) {
//        System.out.println(userName + " get notification that the quantity of "+ obervable.getItemName() + " changes to "+ obervable.getQuantity());
//    }

    @Override
    public void update() {
        System.out.println(userName + " get notification that the quantity of "+ obervable.getItemName() + " changes to "+ obervable.getQuantity());
    }

}
