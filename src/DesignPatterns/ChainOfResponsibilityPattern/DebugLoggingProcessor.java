package DesignPatterns.ChainOfResponsibilityPattern;

public class DebugLoggingProcessor extends LogginProcessor{

    public DebugLoggingProcessor(LogginProcessor processor){
        super(processor);
    }
    @Override
    public void log(String logLevel, String message) {
        if(logLevel.equalsIgnoreCase("DEBUG")){
            System.out.println("DEBUG : " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
