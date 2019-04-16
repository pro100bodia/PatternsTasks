package com.bod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Application {
    private TicTacToe game;
    private Memento memento;

    private void outputMap(List<ArrayList<Integer>> map){
        for(ArrayList<Integer> i: map)
        {
            for(Integer j: i)
            {
                System.out.print(j + " ");

            }
            System.out.println();
        }

    }

    private void callSubMenu(){
        System.out.println("Choose action move | restore | exit");

        Scanner s = new Scanner(System.in);
        String action = s.nextLine();

        switch (getAction(action))
        {
            case MOVE:
                memento = game.getSnapshot();
                game.turn();
                outputMap(game.getMap());
                break;
            case RESTORE:
                memento.restore();
                outputMap(memento.getGame().getMap());
                break;
            case EXIT:
                return;
        }
        callSubMenu();
    }

    public static void main(String[] args) {
        Application app = new Application();

        List<ArrayList<Integer>> map = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < 3; i++)
        {
            map.add(new ArrayList<>());
            for(int j = 0; j < 3; j++)
            {
                map.get(i).add(0);
            }
        }

        app.game = new TicTacToe(map, new Random(), -1);

        app.callSubMenu();
    }

    private static ActionEnum getAction(String action){
        try {
            return ActionEnum.valueOf(action.toUpperCase());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return null;
        }
    }
}
