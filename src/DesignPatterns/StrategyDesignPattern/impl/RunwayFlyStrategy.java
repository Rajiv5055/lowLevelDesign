package DesignPatterns.StrategyDesignPattern.impl;

import DesignPatterns.StrategyDesignPattern.interfaces.FlyStrategyService;

public class RunwayFlyStrategy implements FlyStrategyService {
    @Override
    public void flyStrategy() {
        System.out.println("Fly after running on runway");
    }
}
