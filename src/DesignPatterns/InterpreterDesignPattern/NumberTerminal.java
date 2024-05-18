package DesignPatterns.InterpreterDesignPattern;

public class NumberTerminal implements Interpreter{

    String  str;

    public NumberTerminal(String a){
        this.str = a;
    }
    @Override
    public Integer interprete(Context context) {
        return context.get(str);
    }
}
