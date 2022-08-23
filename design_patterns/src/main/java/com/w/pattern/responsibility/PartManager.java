package com.w.pattern.responsibility;

/**
 * @author blue
 * @version 1.0
 */
public class PartManager extends Handler{

    public PartManager() {
        super(NUM_ONE, NUM_THREE);
    }

    @Override
    protected void handleLeaveRequest(LeaveRequest leaveRequest) {

        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNumber() + "天," + leaveRequest.getContent() + "。");
        System.out.println("部门经理审批：同意。");
    }
}
