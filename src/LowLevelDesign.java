import DesignPatterns.AdaptorDesignPattern.AdaptorDesignMainClass;
import DesignPatterns.BuilderDesignPattern.BuilderPatterMainClass;
import DesignPatterns.ChainOfResponsibilityPattern.ChainOfResponsibiltyDesignMainClaas;
import DesignPatterns.CommandDesignPattern.CommandPatternMainClass;
//import DesignPatterns.CompositeDesignPattern.CompositeDesignMainClass;
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
import MultiThreading.src.ThreadPool;
import netscape.javascript.JSObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

//@FunctionalInterface
//interface DemoInterface{
//    void demoFunction(int a);
//}

public class LowLevelDesign {

    public static void main(String[] args) throws Exception {
//        CompositeDesignMainClass.execute();
//        lambda function
//        DemoInterface demoInterface = (a)->{
//          System.out.println("This is a demo method");
//        };
//
//        demoInterface.demoFunction(6);

        ThreadPool.execute();

    }
}