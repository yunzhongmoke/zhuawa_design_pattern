package com.w.pattern.interpret;

import java.util.HashMap;
import java.util.Map;

/**
 * @author blue
 * @version 1.0
 */
public class Context {

    //聚合Variable
    private Map<Variable, Integer> map = new HashMap<>();

    //添加变量
    public void assign(Variable variable, Integer value) {
        map.put(variable, value);
    }

    //获取变量的值
    public int getValue(Variable variable) {
        return map.get(variable);
    }
}
