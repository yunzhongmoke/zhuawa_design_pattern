package com.w.pattern.command;

/**
 * @author blue
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        //创建订单
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFood("辣椒炒肉", 1);
        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFood("爆炒包菜", 1);

        //创建接收者
        SeniorChef seniorChef = new SeniorChef();

        //创建订单命令
        ICommand cmd1 = new OrderCommand(order1, seniorChef);
        ICommand cmd2 = new OrderCommand(order2, seniorChef);

        //创建请求者
        Waiter waiter = new Waiter();
        waiter.addCommand(cmd1);
        waiter.addCommand(cmd2);
        waiter.orderUp();
    }
}
