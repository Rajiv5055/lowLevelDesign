package DesignPatterns.VisitorDesignPattern;

public interface IVisitor {
    void visit(SingleRoom roomElement);
    void visit(DoubleRoom roomElement);


}
