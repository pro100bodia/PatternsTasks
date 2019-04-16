package com.epam.factory;

public class ActionMovieFactory implements MovieFactory {
    private Voice voice;
    private Subtitle subtitle;

    public ActionMovieFactory(String language) {
        this.voice = new ActionVoice(language);
        this.subtitle = new ActionSubtitle(language);
    }

    public Voice getVoice(){
        return this.voice;
    }

    public Subtitle getSubtitle(){
        return this.subtitle;
    }

    public void show(){
        System.out.println(this.getVoice().getLanguage());
        System.out.println(this.getSubtitle().getLanguage());
    }
}
