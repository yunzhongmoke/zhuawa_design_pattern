package com.w.pattern.combination;

/**
 * @author blue
 * @version 1.0
 */
public class MenuItem extends MenuComponent{

    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        //打印菜单项
        for (int i = 0; i < level; i++) {
            System.out.print("-- ");
        }
        System.out.println(getName());
    }
}
