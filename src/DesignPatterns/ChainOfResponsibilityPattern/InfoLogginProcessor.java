package DesignPatterns.ChainOfResponsibilityPattern;

public class InfoLogginProcessor extends LogginProcessor{


    public InfoLogginProcessor(LogginProcessor processor){
        super(processor);
    }
    @Override
    public void log(String logLevel, String message) {
        if(logLevel.equalsIgnoreCase("INFO")){
            System.out.println("INFO : " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
