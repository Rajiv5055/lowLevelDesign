package DesignPatterns.InterpreterDesignPattern;

public class InterpreterDesignMainClass {

    public static void execute(){
        Context context = new Context();
        context.put("a", 6);
        context.put("b", 12);
        context.put("c", 3);
        context.put("d", 14);

        Interpreter num1 = new NumberTerminal("a");
        Interpreter num2 = new NumberTerminal("b");
        Interpreter num3 = new NumberTerminal("c");
        Interpreter num4 = new NumberTerminal("d");

        Interpreter sum1 = new SumTerminal(num1, num2);
        Interpreter sum2 = new SumTerminal(num3, num4);

        Interpreter multiply = new MultiplyTerminal(sum1, sum2);

        System.out.println(multiply.interprete(context));
    }
}
