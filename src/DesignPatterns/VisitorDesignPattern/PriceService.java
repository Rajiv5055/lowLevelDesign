package DesignPatterns.VisitorDesignPattern;

public class PriceService implements IVisitor{
    @Override
    public void visit(SingleRoom roomElement) {
        roomElement.setPrice(100);
        System.out.println("Price for single room set to " + roomElement.getPrice());
    }

    @Override
    public void visit(DoubleRoom roomElement) {
        roomElement.setPrice(1000);
        System.out.println("Price for Double room set to " + roomElement.getPrice());
    }
}
