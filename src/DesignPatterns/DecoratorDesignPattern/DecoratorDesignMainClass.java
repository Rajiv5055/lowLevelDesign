package DesignPatterns.DecoratorDesignPattern;

public class DecoratorDesignMainClass {
    public static void execute(){
        BasePizza margheritaPizza = new MargheritaPizza();
        System.out.println(margheritaPizza.getCost());

        BasePizza extraCheezePizza = new ExtraaCheeseToppingClass(margheritaPizza);
        System.out.println(extraCheezePizza.getCost());

        BasePizza extraaCheeseWithMushroom = new MushroonToppingClass(extraCheezePizza);
        System.out.println(extraaCheeseWithMushroom.getCost());
    }
}
