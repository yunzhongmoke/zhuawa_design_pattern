package com.w.pattern.responsibility;

/**
 * @author blue
 * @version 1.0
 */
public class GroupLeader extends Handler{

    public GroupLeader() {
        super(0, NUM_ONE);
    }

    @Override
    protected void handleLeaveRequest(LeaveRequest leaveRequest) {

        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNumber() + "天," + leaveRequest.getContent() + "。");
        System.out.println("小组长审批：同意。");

    }
}
