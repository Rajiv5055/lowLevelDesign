package DesignPatterns.SingletonDesignPattern;

public class SingletoneDesignClass {
    public void Execute(){
        SingletonDriverClass singletonDriverClass1 = new SingletonDriverClass();
        SingletonDriverClass singletonDriverClass2 = new SingletonDriverClass();
        singletonDriverClass1.getInstance();
//        singletonDriverClass2.getInstance();
        singletonDriverClass1.incrementId();
        System.out.println(singletonDriverClass1.getId());
        singletonDriverClass2.incrementId();
        System.out.println(singletonDriverClass2.getId());

    }
}
