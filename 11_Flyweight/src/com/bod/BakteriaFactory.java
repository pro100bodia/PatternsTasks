package com.bod;

import java.util.ArrayList;
import java.util.List;

public class BakteriaFactory {
    static List<BakteriaType> types = new ArrayList<>();
    static BakteriaType type;

    public static BakteriaType getType(String color, String shape, String texture){
        for(BakteriaType bt : types)
        {
            if(color.equals(bt.getColor()) &
               shape.equals(bt.getShape()) &
               texture.equals(bt.getTexture())){
                return bt;
            }
        }
        type = new BakteriaType(color, shape, texture);
        types.add(type);
        return type;
    }
}
