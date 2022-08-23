package com.w.pattern.responsibility;

/**
 * @author blue
 * @version 1.0
 */
public class GeneralManager extends Handler{

    public GeneralManager() {
        super(NUM_THREE, NUM_SEVEN);
    }

    @Override
    protected void handleLeaveRequest(LeaveRequest leaveRequest) {

        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNumber() + "天," + leaveRequest.getContent() + "。");
        System.out.println("总经理审批：同意。");
    }
}
