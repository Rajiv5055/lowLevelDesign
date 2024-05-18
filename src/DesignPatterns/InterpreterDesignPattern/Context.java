package DesignPatterns.InterpreterDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String, Integer> context = new HashMap<>();

    public void put(String a, int b){
        context.put(a, b);
    }

    public Integer get(String a){
        return context.get(a);
    }

}
