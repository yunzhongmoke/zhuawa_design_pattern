package com.w.pattern.interpret;

/**
 * @author blue
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");
        Value value = new Value(1);

        Context context = new Context();
        context.assign(a, 1);
        context.assign(b, 2);
        context.assign(c, 3);
        context.assign(d, 4);

        AbstractExpression expression = new Plus(a, new Plus(b, new Minus(new Plus(d, value), c)));
        System.out.println(expression + "=" + expression.interpret(context));

    }
}
