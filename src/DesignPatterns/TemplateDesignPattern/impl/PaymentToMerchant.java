package DesignPatterns.TemplateDesignPattern.impl;

import DesignPatterns.TemplateDesignPattern.PaymentTemplate;

public class PaymentToMerchant extends PaymentTemplate {
    @Override
    public void validatRequest() {
        System.out.println("MechantPayment : validating request");
    }

    @Override
    public void calculateCharges() {
        System.out.println("MechantPayment : 2% fees charged");
    }

    @Override
    public void getDebitAmount() {
        System.out.println("MechantPayment : getting debit amount");
    }

    @Override
    public void getCreditAmount() {
        System.out.println("MechantPayment : getting total credit amount");
    }
}
