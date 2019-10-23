package com.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> history;

    public CareTaker() {
        history = new ArrayList<>();
    }

    public void undo() {
        history.get(history.size() - 1).restore();
    }

    public void setHistory(Memento memento) {
        history.add(memento);
    }

}
