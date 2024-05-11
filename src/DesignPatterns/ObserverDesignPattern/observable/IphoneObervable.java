package DesignPatterns.ObserverDesignPattern.observable;

import DesignPatterns.ObserverDesignPattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObervable implements Obervable {

    private String itemName;
    private List<Observer> observerList;

    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public String getItemName(){
        return itemName;
    }



    public IphoneObervable(String itemName){
        this.observerList = new ArrayList<>();
        this.quantity = 0;
        this.itemName = itemName;
    }
    @Override
    public void add(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObervers(int quantity) {
        for(Observer observer : this.observerList){
//            observer.update(this);
            observer.update();
        }
    }

    @Override
    public void setItemQuantity(int quantity) {
        this.quantity = this.quantity+quantity;
        notifyObervers(quantity);
    }

}
