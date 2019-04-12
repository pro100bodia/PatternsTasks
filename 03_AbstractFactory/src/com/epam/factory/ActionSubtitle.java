package com.epam.factory;

public class ActionSubtitle implements Subtitle{
    private String language;

    public ActionSubtitle(String language) {
        this.language = language;
    }

    @Override
    public String getLanguage() {
        return "I am Action, I show " + language;
    }

    @Override
    public void setLanguage(String language) {
        this.language = language;
    }
}
