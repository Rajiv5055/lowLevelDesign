package DesignPatterns.TemplateDesignPattern.impl;

import DesignPatterns.TemplateDesignPattern.PaymentTemplate;

public class PaymentToFriend extends PaymentTemplate {
    @Override
    public void validatRequest() {
        System.out.println("PaymentToFriend : validating request");
    }

    @Override
    public void calculateCharges() {
        System.out.println("PaymentToFriend : 0% fees charged");
    }

    @Override
    public void getDebitAmount() {
        System.out.println("PaymentToFriend : getting debit amount");
    }

    @Override
    public void getCreditAmount() {
        System.out.println("PaymentToFriend : getting total credit amount");
    }
}
