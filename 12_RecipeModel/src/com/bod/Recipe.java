package com.bod;

public class Recipe {
    private String content;
    private Illness illness;

    public Recipe(String content, Illness illness) {
        this.content = content;
        this.illness = illness;
    }

    public String toString(){
        return String.format("%s\n%s", illness, content);
    }
}
