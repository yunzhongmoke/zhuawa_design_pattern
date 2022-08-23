package com.w.pattern.interpret;

/**
 * @author blue
 * @version 1.0
 */
public class Value extends AbstractExpression{

    private int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public int interpret(Context context) {
        return value;
    }

    @Override
    public String toString() {
        return new Integer(value).toString();
    }
}
