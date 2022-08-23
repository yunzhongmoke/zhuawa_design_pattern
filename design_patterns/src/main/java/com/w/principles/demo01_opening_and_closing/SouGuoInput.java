package com.w.principles.demo01_opening_and_closing;

/**
 * @author blue
 * @version 1.0
 */
public class SouGuoInput {

    //定义一个抽象皮肤对象
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    //调用AbstractSkin中的display方法
    public void display() {
        skin.display();
    }
}
