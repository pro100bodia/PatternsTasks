package com.bod;

import java.util.ArrayList;
import java.util.List;

public class Simulation {
    public static void main(String[] args) {
        List<Recipe> recipes = new ArrayList<>();
        recipes.add(new Recipe("Ocilokokcilum", IllnessFactory.getType("flu", "cold", "cough")));
        recipes.add(new Recipe("Valeriana", IllnessFactory.getType("nervousness", "vertigo", "accelerated pulse")));
        recipes.add(new Recipe("Korvalol", IllnessFactory.getType("nervousness", "vertigo", "accelerated pulse")));
        recipes.add(new Recipe("Valocordine", IllnessFactory.getType("nervousness", "vertigo", "accelerated pulse")));

        for(Recipe b: recipes)
        {
            System.out.println(b);
            System.out.println();
        }
    }
}
