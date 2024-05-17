package DesignPatterns.SingletonAndPrototypeDesignPattern;

public class ProtoTypeConcrete implements ProtoTypeInterface{

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getId() {
        return id;
    }

    public void method(ProtoTypeConcrete this){
        System.out.println( this + " " + getId() + " "+ getName() + " "+ getNumber());
    }

    private String id;
    private String name;
    private String number;

    public ProtoTypeConcrete(String id, String name, String number) {
        this.id = id;
        this.number = number;
        this.name = name;
    }


    @Override
    public ProtoTypeConcrete clone() {
        return new ProtoTypeConcrete(id, name, number);
    }
}
