package DesignPatterns.TemplateDesignPattern;

/*
We cannot implement interface here we have to use abstract because we need a concrete method to follow all sequential steps
 */
public abstract class PaymentTemplate {
    public abstract void validatRequest();
    public abstract void calculateCharges();
    public abstract void getDebitAmount();
    public abstract void getCreditAmount();

    /*
    Both payment concrete classes follow this common sequential steps
     */
    public void processPayment(){

        this.validatRequest();

        this.getDebitAmount();

        this.calculateCharges();

        this.getCreditAmount();
    }
}
