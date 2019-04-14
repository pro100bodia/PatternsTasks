package com.epam.factory;

public class MelodramaVoice implements Voice {
    private String language;

    public MelodramaVoice(String language) {
        this.language = language;
    }

    @Override
    public String getLanguage() {
        return "I am melodrama, I talk " + language ;
    }

    @Override
    public void setLanguage(String language) {
        this.language = language;
    }
}
