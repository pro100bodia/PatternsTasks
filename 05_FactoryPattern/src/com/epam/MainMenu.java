package com.epam;

import com.epam.figure.*;

import java.util.Random;
import java.util.Scanner;
//import com.epam.superFigure.*;

public class MainMenu {
    private static MainMenu mainMenu;

    private Figure generativeFactoryMethod(){
        Random rand = new Random();
        int randomNum = rand.nextInt(14) + 0;

        switch(randomNum)
        {
            case 0: return new com.epam.figure.StraightLine();
            case 1: return new com.epam.figure.RlineReverse();
            case 2: return new com.epam.figure.Rline();
            case 3: return new com.epam.figure.Square();
            case 4: return new com.epam.figure.Tfigure();
            case 5: return new com.epam.figure.DuckFigure();
            case 6: return new com.epam.figure.DuckFigureReverse();

            case 7: return new com.epam.superFigure.StraightLine();
            case 8: return new com.epam.superFigure.RlineReverse();
            case 9: return new com.epam.superFigure.Rline();
            case 10: return new com.epam.superFigure.Square();
            case 11: return new com.epam.superFigure.Tfigure();
            case 12: return new com.epam.superFigure.DuckFigure();
            case 13: return new com.epam.superFigure.DuckFigureReverse();
        }

        return null;
    }

    private void callSubMenu(){
        System.out.println("Choose: generate | exit");
        Scanner s = new Scanner(System.in);

        String param = s.nextLine();

        switch (getParam(param))
        {
            case GENERATE:
                Figure figure = generativeFactoryMethod();
                System.out.println(figure.toString());
                break;
            case EXIT: return;
        }

        callSubMenu();
    }

    public static void main(String[] args) {
        mainMenu = new MainMenu();

        mainMenu.callSubMenu();
    }

    private ParametersEnum getParam(String param){
        try{
            return ParametersEnum.valueOf(param.toUpperCase());
        }catch (IllegalArgumentException e){
            return ParametersEnum.UNDEFINED;
        }
    }
}
