package DesignPatterns.VisitorDesignPattern;

/*
 For each room element is for maintenance service visit(Room) need to implement in this
 class.
 */
public class MaintenanceService implements IVisitor{

    @Override
    public void visit(SingleRoom roomElement) {
        System.out.println("Single room maintenance");
    }

    @Override
    public void visit(DoubleRoom roomElement) {
        System.out.println("Double room maintenance");
    }
}
