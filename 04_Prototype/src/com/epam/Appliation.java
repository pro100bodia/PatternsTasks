package com.epam;

import java.util.ArrayList;
import java.util.List;

public class Appliation {
    private static List<Article> articleArchive;

    public static void main(String[] args) {
        articleArchive = new ArrayList<>();

        String header = "Autism";
        String paragraph = "Autism is a developmental disorder characterized by \n" +
                           "difficulties with social interaction and communication \n" +
                           "and by restricted and repetitive behavior.[3] Parents \n" +
                           "usually notice signs during the first three years of \n" +
                           "their child's life.";

        Article prototoypeArticle = new Article(header, paragraph);

        System.out.println("Orginal article");
        System.out.println(prototoypeArticle.getHeader());
        System.out.println(prototoypeArticle.getParagraph());

        header = "Горизонтальне оперення ";
        paragraph = "Горизонтальне оперення — аеродинамічний профіль, \n" +
                    "розташований в горизонтальній площині літака. \n" +
                    "Забезпечує поздовжню стійкість, керованість і \n" +
                    "балансування літального апарату на всіх режимах \n" +
                    "польоту. Горизонтальне оперення складається з \n" +
                    "нерухомої поверхні — стабілізатора і шарнірно \n" +
                    "підвішеного до нього керма висоти. У літаків з \n" +
                    "хвостовим розташуванням оперення горизонтальне \n" +
                    "оперення встановлюється у хвостовій частині літака \n" +
                    "— на фюзеляжі або на верху кіля (T-подібна схема).";

        Article copyArticle = prototoypeArticle.clone();
        copyArticle.setHeader(header);
        copyArticle.setParagraph(paragraph);

        System.out.println("\nCopy article");
        System.out.println(copyArticle.getHeader());
        System.out.println(copyArticle.getParagraph());
    }
}
