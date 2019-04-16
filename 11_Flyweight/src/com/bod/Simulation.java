package com.bod;

import java.util.ArrayList;
import java.util.List;

public class Simulation {
    public static void main(String[] args) {
        List<Bakteria> bakterias = new ArrayList<>();
        bakterias.add(new Bakteria(1, 2, BakteriaFactory.getType("green", "round", "smooth")));
        bakterias.add(new Bakteria(3, 4, BakteriaFactory.getType("green", "round", "smooth")));
        bakterias.add(new Bakteria(5, 6, BakteriaFactory.getType("blue", "square", "rigid")));
        bakterias.add(new Bakteria(7, 8, BakteriaFactory.getType("green", "round", "smooth")));
        bakterias.add(new Bakteria(9, 10, BakteriaFactory.getType("blue", "square", "rigid")));
        bakterias.add(new Bakteria(11, 12, BakteriaFactory.getType("yellow", "round", "smooth")));

        for(Bakteria b: bakterias)
        {
            b.draw();
            System.out.println();
        }
    }
}
