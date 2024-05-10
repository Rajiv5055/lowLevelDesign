package DesignPatterns.DecoratorDesignPattern;

public class ExtraaCheeseToppingClass extends ToppingDecorator{

    public ExtraaCheeseToppingClass(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public double getCost() {
        return this.basePizza.getCost() + 20.0;
    }
}
