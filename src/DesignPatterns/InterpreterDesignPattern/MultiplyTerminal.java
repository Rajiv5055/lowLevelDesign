package DesignPatterns.InterpreterDesignPattern;

public class MultiplyTerminal implements Interpreter{
    Interpreter left;
    Interpreter right;

    public MultiplyTerminal(Interpreter l, Interpreter r){
        this.left = l;
        this.right = r;
    }
    @Override
    public Integer interprete(Context context) {
        return left.interprete(context) * right.interprete(context);
    }
}
