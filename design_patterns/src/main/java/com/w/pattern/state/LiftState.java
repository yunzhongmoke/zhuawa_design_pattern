package com.w.pattern.state;

/**
 * @author blue
 * @version 1.0
 */
public abstract class LiftState {

    //定义环境角色
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    //电梯开门动作
    public abstract void open();

    //电梯关门动作
    public abstract void close();

    //电梯运行动作
    public abstract void run();

    //电梯停止动作
    public abstract void stop();
}
