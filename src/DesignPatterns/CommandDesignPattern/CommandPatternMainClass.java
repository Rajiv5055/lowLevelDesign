package DesignPatterns.CommandDesignPattern;

import DesignPatterns.CommandDesignPattern.commands.*;
import DesignPatterns.CommandDesignPattern.invoker.AcRemoteClass;
import DesignPatterns.CommandDesignPattern.receiver.AirConditionerReceiverClass;

public class CommandPatternMainClass {

    public static void execute(){
        AirConditionerReceiverClass ac = new AirConditionerReceiverClass();
        AcRemoteClass button = new AcRemoteClass();
        ICommand turnOnCommand = new TurnOnCommand(ac);
        ICommand turnOffCommand = new TurnOffCommand(ac);
        ICommand increaseTemp = new IncreaseTemperatureCommand(ac);
        ICommand decreaseTemp = new DecreasetemperatureCommand(ac);

        button.setCommand(turnOnCommand);
        button.pressButton();
        button.setCommand(increaseTemp);
        button.pressButton();
        button.setCommand(decreaseTemp);
        button.pressButton();
        button.setCommand(turnOffCommand);
        button.pressButton();

        button.undo();
        button.undo();
        button.undo();
        button.undo();
        button.undo();
    }
}
