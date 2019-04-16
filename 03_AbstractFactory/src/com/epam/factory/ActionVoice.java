package com.epam.factory;

public class ActionVoice implements Voice{
    private String language;

    public ActionVoice(String language) {
        this.language = language;
    }

    @Override
    public String getLanguage() {
        return "I am Action, I talk " + language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
