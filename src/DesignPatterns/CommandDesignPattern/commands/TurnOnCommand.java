package DesignPatterns.CommandDesignPattern.commands;

import DesignPatterns.CommandDesignPattern.receiver.AirConditionerReceiverClass;

public class TurnOnCommand implements ICommand{

    AirConditionerReceiverClass ac;

    public TurnOnCommand(AirConditionerReceiverClass ac){
        this.ac = ac;
    }
    @Override
    public void execute(){
        ac.turnOnAC();
    }

    @Override
    public void undo() {
        ac.turnOffAC();
    }
}
