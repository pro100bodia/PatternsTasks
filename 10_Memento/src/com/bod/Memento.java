package com.bod;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private TicTacToe game;
    private List<ArrayList<Integer>> map;

    public Memento(TicTacToe game, List<ArrayList<Integer>> map) {
        this.game = game;
        this.map = map;
    }

    public void restore(){
        game.setMap(map);
    }

    public TicTacToe getGame() {
        return game;
    }
}
