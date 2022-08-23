package com.w.pattern.mediator;

/**
 * @author blue
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        //创建中介者对象
        MediatorStructure mediator = new MediatorStructure();

        //租房者
        Tenant tenant = new Tenant("张三", mediator);

        //房屋拥有者
        HouseOwner houseOwner = new HouseOwner("李四", mediator);

        mediator.setTenant(tenant);
        mediator.setHouseOwner(houseOwner);

        tenant.contact("我要租房子");
        houseOwner.contact("我有房子");
    }
}
