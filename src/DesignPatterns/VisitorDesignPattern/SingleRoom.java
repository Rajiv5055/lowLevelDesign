package DesignPatterns.VisitorDesignPattern;

public class SingleRoom extends RoomElementAbstract{
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
