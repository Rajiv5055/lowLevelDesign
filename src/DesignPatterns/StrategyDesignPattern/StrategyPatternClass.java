package DesignPatterns.StrategyDesignPattern;

import DesignPatterns.StrategyDesignPattern.impl.Aeroplane;
import DesignPatterns.StrategyDesignPattern.impl.Bird;
import DesignPatterns.StrategyDesignPattern.impl.FlappingStrategy;
import DesignPatterns.StrategyDesignPattern.impl.RunwayFlyStrategy;
import DesignPatterns.StrategyDesignPattern.interfaces.*;
public class StrategyPatternClass {

    public void Execute(){
        FlyStrategyService runwayStrategy = new RunwayFlyStrategy();
        FlyStrategyService flappingStrategy = new FlappingStrategy();

        FlyingObjectService aeroplaneService = new Aeroplane(runwayStrategy);
        aeroplaneService.fly();

        FlyingObjectService birdService = new Bird(flappingStrategy);
        birdService.fly();


    }
}
