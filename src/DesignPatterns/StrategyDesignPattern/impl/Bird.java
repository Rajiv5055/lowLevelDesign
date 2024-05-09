package DesignPatterns.StrategyDesignPattern.impl;


import DesignPatterns.StrategyDesignPattern.interfaces.FlyStrategyService;
import DesignPatterns.StrategyDesignPattern.interfaces.FlyingObjectService;

public class Bird implements FlyingObjectService {

    FlyStrategyService flyStrategyService;

    public Bird(FlyStrategyService flyStrategyService){
        this.flyStrategyService = flyStrategyService;
    }
    @Override
    public void fly() {
        this.flyStrategyService.flyStrategy();
    }
}
