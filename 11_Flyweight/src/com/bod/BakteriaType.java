package com.bod;

public class BakteriaType {
    String color, shape, texture;

    public BakteriaType(String color, String shape, String texture) {
        this.color = color;
        this.shape = shape;
        this.texture = texture;
    }

    public void draw(){
        System.out.println("I am " + color +", " + shape + " shaped and with a " + texture + " texture");
    }

    public String getColor() {
        return color;
    }

    public String getShape() {
        return shape;
    }

    public String getTexture() {
        return texture;
    }


}
