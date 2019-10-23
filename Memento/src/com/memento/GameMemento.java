package com.memento;

public class GameMemento implements Memento {
    private TicTacToe originator;
    private String[] boardState;

    public GameMemento(TicTacToe originator, String[] board, CareTaker careTaker) {
        this.originator = originator;
        this.boardState = new String[board.length];
        fillArray(board);
        careTaker.setHistory(this);
    }

    public void fillArray(String[] board){
        System.arraycopy(board,0,boardState,0,board.length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GameMemento gameMemento = (GameMemento) o;
        return originator == gameMemento.originator &&
                boardState == gameMemento.boardState;
    }

    @Override
    public void restore() {
        originator.setBoard(boardState);
    }

}
