package DesignPatterns.SingletonDesignPattern;

public class SingletonDriverClass {

    // Eager initiation
//    private static SingletonClass singletonClass = new SingletonClass();

    private static SingletonClass singletonClass;

    public SingletonClass getInstance(){
        if(this.singletonClass == null){
            this.singletonClass = new SingletonClass();
        }
        return this.singletonClass;
    }

    public void incrementId(){
        this.singletonClass.setId(this.singletonClass.getId()+1);
    }
    public Long getId(){
        return this.singletonClass.getId();
    }
}
