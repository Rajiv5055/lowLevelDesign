package DesignPatterns.AdaptorDesignPattern;

import DesignPatterns.AdaptorDesignPattern.adaptor.WeightMachingAdaptorImpl;
import DesignPatterns.AdaptorDesignPattern.adaptor.WeightingMachineAdaptor;
import DesignPatterns.AdaptorDesignPattern.existing.WeightingMachine;
import DesignPatterns.AdaptorDesignPattern.existing.WeightingMachineImpl;

public class AdaptorDesignMainClass {
    public static void execute(){
        WeightingMachine weightingMachine = new WeightingMachineImpl();
        WeightingMachineAdaptor weightingMachineAdaptor = new WeightMachingAdaptorImpl(weightingMachine);

        System.out.println("Weight in pounds : " + weightingMachine.getWeightInPound());
        System.out.println("Weight in kilograms : " + weightingMachineAdaptor.getWeightinKilograms());
    }
}
