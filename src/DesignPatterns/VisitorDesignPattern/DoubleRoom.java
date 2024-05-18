package DesignPatterns.VisitorDesignPattern;

public class DoubleRoom extends RoomElementAbstract{
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
