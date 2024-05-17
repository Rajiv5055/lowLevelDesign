package DesignPatterns.IteratorDesignPattern;

public class Book {
    public int getId() {
        return id;
    }
    public String getName(){
        return this.name;
    }

    private int id;
    private String name;

    public Book(int id, String name){
        this.id = id;
        this.name = name;
    }


}
