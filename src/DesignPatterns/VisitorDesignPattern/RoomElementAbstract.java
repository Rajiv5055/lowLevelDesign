package DesignPatterns.VisitorDesignPattern;

public abstract class RoomElementAbstract {
    private long price = 0;
    public void setPrice(long a){
        price = a;
    }
    public long getPrice(){
        return this.price;
    }

    public abstract void accept(IVisitor visitor);
}
