package com.w.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author blue
 * @version 1.0
 */
public class Waiter {

    //持有命令对象
    private List<ICommand> commands = new ArrayList<>();

    //添加命令
    public void addCommand(ICommand command) {
        commands.add(command);
    }

    //发出命令
    public void orderUp() {

        System.out.println("发出新订单");
        //遍历commands
        commands.forEach(command -> {
            //执行订单
            command.execute();
            System.out.println();
        });

        System.out.println("订单完成~~~~");
    }

}
