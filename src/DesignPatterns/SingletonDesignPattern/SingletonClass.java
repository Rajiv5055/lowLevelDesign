package DesignPatterns.SingletonDesignPattern;

public class SingletonClass {
    private Long Id;

    public SingletonClass(){
        this.Id = 0L;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
