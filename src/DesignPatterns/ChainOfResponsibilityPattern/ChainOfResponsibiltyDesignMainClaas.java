package DesignPatterns.ChainOfResponsibilityPattern;

public class ChainOfResponsibiltyDesignMainClaas {

    public static void execute(){
        LogginProcessor logginProcessor = new InfoLogginProcessor(new DebugLoggingProcessor(new ErrorLoggingProcessor(null)));
        logginProcessor.log("INFO", "This is demo message");
        logginProcessor.log("DEBUG", "This is demo message");
        logginProcessor.log("ERROR", "This is demo message");
    }
}
