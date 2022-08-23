package com.w.pattern.combination;

/**
 * @author blue
 * @version 1.0
 */
public abstract class MenuComponent {

    protected String name;
    protected int level;

    //add menu
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    //remove menu
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    //获取指定的子菜单
    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    //获取菜单名称
    public String getName() {
        return name;
    }

    //打印菜单以及子菜单
    public void print() {
        throw new UnsupportedOperationException();
    }
}