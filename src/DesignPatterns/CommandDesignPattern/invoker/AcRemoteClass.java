package DesignPatterns.CommandDesignPattern.invoker;

import DesignPatterns.CommandDesignPattern.commands.ICommand;

import java.util.Stack;

public class AcRemoteClass {
    Stack<ICommand> commandHistory = new Stack<>();
    ICommand currentCommand;

    public void setCommand(ICommand iCommand){
        this.currentCommand = iCommand;
    }

    public void pressButton(){
        currentCommand.execute();
        commandHistory.add(currentCommand);
    }

    public void undo(){

        if(commandHistory.empty()){
            System.out.println("Exception : No undo trace available");
            return;
        }

        ICommand topCommand = commandHistory.pop();
        topCommand.undo();
    }


}
