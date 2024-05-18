package DesignPatterns.InterpreterDesignPattern;

public class SumTerminal implements Interpreter{

    Interpreter left;
    Interpreter right;

    public SumTerminal(Interpreter l, Interpreter r){
        this.left = l;
        this.right = r;
    }
    @Override
    public Integer interprete(Context context) {
        return left.interprete(context) + right.interprete(context);
    }
}
