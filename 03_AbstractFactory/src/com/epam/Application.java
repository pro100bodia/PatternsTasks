package com.epam;

import com.epam.factory.ActionMovieFactory;
import com.epam.factory.GenresEnum;
import com.epam.factory.LanguagesEnum;
import com.epam.factory.MelodramaMovieFactory;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Choose a genre");
        String genre = s.nextLine();

        System.out.println("Choose a laguage");
        String language = s.nextLine();

        switch (getGenre(genre))
        {
            case ACTION:
                switch (getLanguage(language))
                {
                    case RUSSIAN:
                    case JAPANESE:
                        new ActionMovieFactory(language).show();
                }
                break;
            case MELODRAMA:
                switch (getLanguage(language))
                {
                    case RUSSIAN:
                    case JAPANESE:
                        new MelodramaMovieFactory(language).show();
                }
        }

    }

    private static GenresEnum getGenre(String parameter){
        try {
            return GenresEnum.valueOf(parameter.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("We have not " + parameter);
            return null;
        }
    }

    private static LanguagesEnum getLanguage(String parameter){
        try {
            return LanguagesEnum.valueOf(parameter.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("We have not " + parameter);
            return null;
        }
    }
}
