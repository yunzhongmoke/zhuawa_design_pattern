package com.w.pattern.interpret;

/**
 * @author blue
 * @version 1.0
 */
public class Variable extends AbstractExpression{

    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
