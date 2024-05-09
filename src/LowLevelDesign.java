import DesignPatterns.ObserverDesignPattern.ObserverMainClass;
import DesignPatterns.SingletonDesignPattern.SingletoneDesignClass;

public class LowLevelDesign {
    public static void main(String[] args) {

//        SingletoneDesignClass singletoneDesignClass = new SingletoneDesignClass();
//        singletoneDesignClass.Execute();

//        StrategyPatternClass strategyPatternClass = new StrategyPatternClass();
//        strategyPatternClass.Execute();

        ObserverMainClass observerMainClass = new ObserverMainClass();
        observerMainClass.execute();
    }
}