package com.w.pattern.memento.white_box;

/**
 * @author blue
 * @version 1.0
 */
public class RoleStateCaretaker {

    //聚合RoleStateMemento
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
