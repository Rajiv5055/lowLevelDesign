package DesignPatterns.DecoratorDesignPattern;

public class MushroonToppingClass extends ToppingDecorator{

    public MushroonToppingClass(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public double getCost() {
        return this.basePizza.getCost() + 15.0;
    }
}
