import singletonDesignPatterns.SingletoneDesignClass;
import strategyDesignPattern.StrategyPatternClass;

public class LowLevelDesign {
    public static void main(String[] args) {

//        singletonDesignPatterns.SingletoneDesignClass singletoneDesignClass = new SingletoneDesignClass();
//        singletoneDesignClass.Execute();

        strategyDesignPattern.StrategyPatternClass strategyPatternClass = new StrategyPatternClass();
        strategyPatternClass.Execute();
    }
}