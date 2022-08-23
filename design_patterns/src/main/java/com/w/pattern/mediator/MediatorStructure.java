package com.w.pattern.mediator;

/**
 * @author blue
 * @version 1.0
 */
public class MediatorStructure extends Mediator{

    //聚合同事类信息
    private Tenant tenant;
    private HouseOwner houseOwner;

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    @Override
    public void contact(String message, Person person) {

        //判断person的运行类型
        if (person instanceof Tenant) {
            houseOwner.getMessage(message);
        } else {
            tenant.getMessage(message);
        }
    }
}
