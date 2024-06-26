package DesignPatterns.ObserverDesignPattern;

import DesignPatterns.ObserverDesignPattern.observable.IphoneObervable;
import DesignPatterns.ObserverDesignPattern.observable.Obervable;
import DesignPatterns.ObserverDesignPattern.observer.Observer;
import DesignPatterns.ObserverDesignPattern.observer.UserObserver;

public class ObserverPatternMainClass {

    public static void execute(){
        Obervable obervable = new IphoneObervable("Iphone");
        Observer observer1 = new UserObserver("User1", obervable);
        Observer observer2 = new UserObserver("User2", obervable);
        obervable.add(observer1);
        obervable.add(observer2);

//        Obervable obervable = new IphoneObervable("Iphone");
//        Observer observer1 = new UserObserver("User1");
//        Observer observer2 = new UserObserver("User2");
//        obervable.add(observer1);
//        obervable.add(observer2);

        obervable.setItemQuantity(10);

    }
}
