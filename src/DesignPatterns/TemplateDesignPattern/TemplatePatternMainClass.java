package DesignPatterns.TemplateDesignPattern;

import DesignPatterns.TemplateDesignPattern.impl.PaymentToFriend;
import DesignPatterns.TemplateDesignPattern.impl.PaymentToMerchant;

public class TemplatePatternMainClass {

    public static void execute(){
        PaymentTemplate merchantPayment = new PaymentToMerchant();
        PaymentTemplate frientPayment = new PaymentToFriend();

        merchantPayment.processPayment();
        System.out.println("============================================================");
        frientPayment.processPayment();
    }
}
