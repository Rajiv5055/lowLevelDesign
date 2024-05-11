package DesignPatterns.AdaptorDesignPattern.adaptor;

import DesignPatterns.AdaptorDesignPattern.existing.WeightingMachine;

public class WeightMachingAdaptorImpl implements WeightingMachineAdaptor{
    /*
     Adaptor has a relationship with existing implementations
     */
    WeightingMachine weightingMachine;
    public WeightMachingAdaptorImpl(WeightingMachine weightingMachine){
        this.weightingMachine = weightingMachine;
    }

    @Override
    public double getWeightinKilograms() {
        return weightingMachine.getWeightInPound() * .45;
    }
}
