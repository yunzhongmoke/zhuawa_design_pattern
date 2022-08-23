package com.w.pattern.memento.white_box;

/**
 * @author blue
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        GameRole gameRole = new GameRole();
        gameRole.initState();
        System.out.println(gameRole);
        //保存当前状态
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());

        gameRole.fight();
        System.out.println(gameRole);

        gameRole.recoverState(roleStateCaretaker.getRoleStateMemento());
        System.out.println(gameRole);
    }
}
