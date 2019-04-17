package com.bod;

import java.util.ArrayList;
import java.util.List;

public class IllnessFactory {
    static List<Illness> types = new ArrayList<>();
    static Illness type;

    public static Illness getType(String symptom0, String symptom1, String symptom2){
        for(Illness bt : types)
        {
            if(symptom0.equals(bt.getSymptom0()) &
               symptom1.equals(bt.getSymptom1()) &
               symptom2.equals(bt.getSymptom2())){
                return bt;
            }
        }
        type = new Illness(symptom0, symptom1, symptom2);
        types.add(type);
        return type;
    }
}
