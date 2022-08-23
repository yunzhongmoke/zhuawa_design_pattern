package com.w.pattern.responsibility;

/**
 * @author blue
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        //创建请假条
        LeaveRequest leaveRequest = new LeaveRequest("张三", 3, "不给我请假，你们就过不上想要的生活");

        //创建各级领导
        GroupLeader groupLeader = new GroupLeader();
        PartManager partManager = new PartManager();
        GeneralManager generalManager = new GeneralManager();

        //设置上级领导
        groupLeader.setNextHandler(partManager);
        partManager.setNextHandler(generalManager);

        //提交请假条
        groupLeader.submitLeaveRequest(leaveRequest);
    }
}
