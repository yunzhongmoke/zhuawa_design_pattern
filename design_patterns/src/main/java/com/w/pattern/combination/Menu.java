package com.w.pattern.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author blue
 * @version 1.0
 */
public class Menu extends MenuComponent{

    //创建一个单列集合，用于保存菜单项
    private List<MenuComponent> menuComponentList = new ArrayList<>();

    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    @Override
    public void print() {
        //打印菜单及子菜单
        for (int i = 0; i < level; i++) {
            System.out.print("-- ");
        }
        System.out.println(getName());
        //遍历menuComponentList
        menuComponentList.forEach(item -> {
            item.print();
        });
    }
}
