package com.epam.factory;

public class MelodramaMovieFactory implements MovieFactory {
    private Voice voice;
    private Subtitle subtitle;

    public MelodramaMovieFactory(String language) {
        this.voice = new MelodramaVoice(language);
        this.subtitle = new MelodramaSubtitle(language);
    }

    @Override
    public Voice getVoice() {
        return voice;
    }

    @Override
    public Subtitle getSubtitle() {
        return subtitle;
    }

    public void show(){
        System.out.println(getVoice().getLanguage());
        System.out.println(getSubtitle().getLanguage());
    }
}
