package com.epam.factory;

public class MelodramaSubtitle implements Subtitle {
    private String language;

    public MelodramaSubtitle(String language) {
        this.language = language;
    }

    @Override
    public String getLanguage() {
        return "I am melodrama, I show " + language;
    }

    @Override
    public void setLanguage(String language) {
        this.language = language;
    }
}
