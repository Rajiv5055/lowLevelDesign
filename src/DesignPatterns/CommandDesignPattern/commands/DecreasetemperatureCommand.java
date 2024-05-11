package DesignPatterns.CommandDesignPattern.commands;

import DesignPatterns.CommandDesignPattern.receiver.AirConditionerReceiverClass;

public class DecreasetemperatureCommand implements ICommand{
    AirConditionerReceiverClass ac;

    public DecreasetemperatureCommand(AirConditionerReceiverClass ac){
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.decreaseTemperature();
    }

    @Override
    public void undo() {
        ac.increaseTemperature();
    }
}
