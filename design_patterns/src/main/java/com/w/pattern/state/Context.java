package com.w.pattern.state;

/**
 * @author blue
 * @version 1.0
 */
public class Context {

    //定义所有电梯状态
    public final static OpeningState OPENING_STATE = new OpeningState();
    public final static ClosingState CLOSING_STATE = new ClosingState();
    public final static StoppingState STOPPING_STATE = new StoppingState();
    public final static RunningState RUNNING_STATE = new RunningState();

    //定义一个电梯状态
    private LiftState liftState;

    public void setLiftState(LiftState liftState) {
        //电梯状态改变
        this.liftState = liftState;
        //电梯内的环境改变
        this.liftState.setContext(this);
    }


    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }
}
