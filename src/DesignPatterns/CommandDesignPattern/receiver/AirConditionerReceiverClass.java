package DesignPatterns.CommandDesignPattern.receiver;

import java.sql.SQLOutput;

public class AirConditionerReceiverClass {
    private boolean isOn;
    private Long currentTemp;

    public void turnOnAC(){
        this.isOn = true;
        this.currentTemp = 25L;
        System.out.println("AC is turned on");
    }

    public void turnOffAC(){
        this.isOn = false;
        System.out.println("AC is turned off");
    }

    public void increaseTemperature(){
        this.currentTemp ++;
        System.out.println("AC temperature increased to " + this.currentTemp);
    }

    public void decreaseTemperature() {
        this.currentTemp --;
        System.out.println("AC temperature decreased to " + this.currentTemp);
    }
}
