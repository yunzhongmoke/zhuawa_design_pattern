package com.w.principles.demo01_opening_and_closing;

/**
 * @author blue
 * @version 1.0
 * 测试类(客户端)
 */
public class Client {

    public static void main(String[] args) {

        //创建SouGouInput对象
        SouGuoInput input = new SouGuoInput();
        //创建DefaultSkin对象
        DefaultSkin defaultSkin = new DefaultSkin();
        //创建SpecificSkin对象
        SpecificSkin specificSkin = new SpecificSkin();
        //将skin依赖注入SouGouInput对象中
        input.setSkin(specificSkin);
        //调用SouGouInput对象display方法
        input.display();
    }
}
