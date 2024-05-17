package DesignPatterns.SingletonAndPrototypeDesignPattern;

public class SingletoneDesignMainClass {
    public static void execute(){
        SingletonDriverClass singletonDriverClass1 = new SingletonDriverClass();
        SingletonDriverClass singletonDriverClass2 = new SingletonDriverClass();
        singletonDriverClass1.getInstance();
//        singletonDriverClass2.getInstance();
        singletonDriverClass1.incrementId();
        System.out.println(singletonDriverClass1.getId());
        singletonDriverClass2.incrementId();
        System.out.println(singletonDriverClass2.getId());

        ProtoTypeConcrete prototype = new ProtoTypeConcrete("1", "name", "number");

        ProtoTypeConcrete newPrototype = (ProtoTypeConcrete) prototype.clone();

        prototype.method();
        newPrototype.method();
    }
}
