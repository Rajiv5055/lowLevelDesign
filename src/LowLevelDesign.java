import DesignPatterns.AdaptorDesignPattern.AdaptorDesignMainClass;
import DesignPatterns.BuilderDesignPattern.BuilderPatterMainClass;
import DesignPatterns.ChainOfResponsibilityPattern.ChainOfResponsibiltyDesignMainClaas;
import DesignPatterns.CommandDesignPattern.CommandPatternMainClass;
import DesignPatterns.CompositeDesignPattern.CompositeDesignMainClass;
import DesignPatterns.DecoratorDesignPattern.DecoratorDesignMainClass;
import DesignPatterns.InterpreterDesignPattern.InterpreterDesignMainClass;
import DesignPatterns.IteratorDesignPattern.IteratorMainClass;
import DesignPatterns.MediatorDesignPattern.MediatorDesignMainClass;
import DesignPatterns.ObserverDesignPattern.ObserverPatternMainClass;
import DesignPatterns.ProxyDesignPattern.ProxyDesignMainClass;
import DesignPatterns.SingletonAndPrototypeDesignPattern.SingletoneDesignMainClass;
import DesignPatterns.StrategyDesignPattern.StrategyPatternMainClass;
import DesignPatterns.TemplateDesignPattern.TemplatePatternMainClass;
import DesignPatterns.VisitorDesignPattern.VisitorPatterMainClass;
import FileHandling.FileMainClass;
import MultiThreading.src.Multithreading;

@FunctionalInterface
interface DemoInterface{
    void demoFunction(int a);
}
public class LowLevelDesign {
    public static void main(String[] args) throws Exception {
//        FileMainClass.execute();

//        lambda function
        DemoInterface demoInterface = (a)->{
          System.out.println("This is a demo method");
        };

        demoInterface.demoFunction(6);

    }
}