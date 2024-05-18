package DesignPatterns.ChainOfResponsibilityPattern;

public class ErrorLoggingProcessor extends LogginProcessor{
    public ErrorLoggingProcessor(LogginProcessor processor){
        super(processor);
    }
    @Override
    public void log(String logLevel, String message) {
        if(logLevel.equalsIgnoreCase("ERROR")){
            System.out.println("ERROR : " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
