package com.bod;

public class Illness {
    String symptom0, symptom1, symptom2;

    public Illness(String symptom0, String symptom1, String symptom2) {
        this.symptom0 = symptom0;
        this.symptom1 = symptom1;
        this.symptom2 = symptom2;
    }

    public String toString(){
        return String.format("Use when noticing: %s, %s, %s", symptom0, symptom1, symptom2);
    }

    public String getSymptom0() {
        return symptom0;
    }

    public String getSymptom1() {
        return symptom1;
    }

    public String getSymptom2() {
        return symptom2;
    }
}
