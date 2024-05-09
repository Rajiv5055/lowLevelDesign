package DesignPatterns.StrategyDesignPattern.impl;

import DesignPatterns.StrategyDesignPattern.interfaces.FlyStrategyService;

public class FlappingStrategy implements FlyStrategyService {
    @Override
    public void flyStrategy() {
        System.out.println("Fly by flapping wings");
    }
}
