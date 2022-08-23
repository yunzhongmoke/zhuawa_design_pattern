package com.w.pattern.responsibility;

/**
 * @author blue
 * @version 1.0
 */
public abstract class Handler {

    protected static final Integer NUM_ONE = 1;
    protected static final Integer NUM_THREE = 3;
    protected static final Integer NUM_SEVEN = 7;

    //处理请假天数的区间
    private Integer start;
    private Integer end;

    //后一个处理者
    private Handler nextHandler;

    public Handler(Integer start) {
        this.start = start;
    }

    public Handler(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //各级领导处理请假条
    protected abstract void handleLeaveRequest(LeaveRequest leaveRequest);

    //提交请假条
    public void submitLeaveRequest(LeaveRequest leaveRequest) {

        //当前领导处理请假条
        this.handleLeaveRequest(leaveRequest);
        //判断是否有上级领导及该领导权限是否不足
        if (this.nextHandler != null && this.end < leaveRequest.getNumber()) {
            //提交给上级领导
            this.nextHandler.submitLeaveRequest(leaveRequest);
        } else {
            System.out.println("请假成功~");
        }
    }

}
