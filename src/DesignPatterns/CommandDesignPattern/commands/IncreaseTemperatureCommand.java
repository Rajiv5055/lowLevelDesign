package DesignPatterns.CommandDesignPattern.commands;

import DesignPatterns.CommandDesignPattern.receiver.AirConditionerReceiverClass;

public class IncreaseTemperatureCommand implements ICommand{
    AirConditionerReceiverClass ac;

    public IncreaseTemperatureCommand(AirConditionerReceiverClass ac){
        this.ac = ac;
    }
    @Override
    public void execute(){
        ac.increaseTemperature();
    }

    @Override
    public void undo() {
        ac.decreaseTemperature();
    }
}
