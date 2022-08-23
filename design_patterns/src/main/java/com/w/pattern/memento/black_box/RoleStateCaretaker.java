package com.w.pattern.memento.black_box;

import com.w.pattern.memento.white_box.RoleStateMemento;

/**
 * @author blue
 * @version 1.0
 */
public class RoleStateCaretaker {

    //聚合IMemento
    private IMemento memento;

    public IMemento getMemento() {
        return memento;
    }

    public void setMemento(IMemento memento) {
        this.memento = memento;
    }
}
