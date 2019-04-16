package com.bod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TicTacToe implements Cloneable{
    private List<ArrayList<Integer>> map;
    private Random random;
    private int player;

    public TicTacToe(List<ArrayList<Integer>> map, Random random, int player) {
        this.map = map;
        this.random = random;
        this.player = player;
    }

    private int i, j;

    public void turn(){
        i = random.nextInt(3);
        j = random.nextInt(3);

        map.get(i).set(j, player);

        player *= -1;
    }

    public List<ArrayList<Integer>> getMap() {
        return map;
    }

    public void setMap(List<ArrayList<Integer>> map) {
        this.map = map;
    }

    public Memento getSnapshot(){
        return new Memento(this, new ArrayList<ArrayList<Integer>>(map));
    }

    public TicTacToe clone(){
        return new TicTacToe(map, random, player);
    }
}
