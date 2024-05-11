package DesignPatterns.CommandDesignPattern.commands;

import DesignPatterns.CommandDesignPattern.receiver.AirConditionerReceiverClass;

public class TurnOffCommand implements ICommand{
    AirConditionerReceiverClass ac;

    public TurnOffCommand(AirConditionerReceiverClass ac){
        this.ac = ac;
    }
    @Override
    public void execute(){
        ac.turnOffAC();
    }

    @Override
    public void undo() {
        ac.turnOnAC();
    }
}
