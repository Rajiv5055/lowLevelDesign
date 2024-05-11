package DesignPatterns.BuilderDesignPattern;

public class StudentClass {

    private String id;
    private String name;
    private String contactNumber;


    public StudentClass setId(String id){
        this.id = id;
        return this;
    }

    public StudentClass setName(String name){
        this.name = name;
        return this;
    }

    public StudentClass setContactNumber(String number){
        this.contactNumber = number;
        return this;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getContactNumber(){
        return this.contactNumber;
    }

}
