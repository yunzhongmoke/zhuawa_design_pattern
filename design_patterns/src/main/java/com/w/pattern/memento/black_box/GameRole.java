package com.w.pattern.memento.black_box;

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
    public IMemento saveState() {
        return new RoleStateMemento(vitality, attack, defense);
    }

    //回溯之前状态
    public void recoverState(IMemento memento) {

        //向下转型
        RoleStateMemento roleStateMemento = (RoleStateMemento) memento;

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

    private class RoleStateMemento implements IMemento {

        private int vitality;
        private int attack;
        private int defense;

        public RoleStateMemento(int vitality, int attack, int defense) {
            this.vitality = vitality;
            this.attack = attack;
            this.defense = defense;
        }

        public RoleStateMemento() {
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
}
