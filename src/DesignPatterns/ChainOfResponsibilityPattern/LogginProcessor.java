package DesignPatterns.ChainOfResponsibilityPattern;

public abstract class LogginProcessor {

    private LogginProcessor nextLogginProcessor;

    public LogginProcessor(LogginProcessor nextLogginProcessor){
        this.nextLogginProcessor = nextLogginProcessor;
    }
    public void log(String loggingLevel, String message){
        if(nextLogginProcessor != null){
            nextLogginProcessor.log(loggingLevel, message);
        }
    }
}
