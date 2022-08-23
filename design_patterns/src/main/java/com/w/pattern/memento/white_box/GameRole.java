package com.w.pattern.memento.white_box;

/**
 * @author blue
 * @version 1.0
 */
public class GameRole {

    private int vitality;
    private int attack;
    private int defense;

    //初始化状态
    public void initState() {
        vitality = 100;
        attack = 100;
        defense = 100;
    }

    //战斗
    public void fight() {
        vitality = 0;
        attack = 0;
        defense = 0;
    }

    //保存当前状态
    public RoleStateMemento saveState() {
        return new RoleStateMemento(vitality, attack, defense);
    }

    //回溯之前状态
    public void recoverState(RoleStateMemento roleStateMemento) {
        vitality = roleStateMemento.getVitality();
        attack = roleStateMemento.getAttack();
        defense = roleStateMemento.getDefense();
    }

    @Override
    public String toString() {
        return "GameRole{" +
                "vitality=" + vitality +
                ", attack=" + attack +
                ", defense=" + defense +
                '}';
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
