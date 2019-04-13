package com.epam;

public class Article implements Prototype{
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getParagraph() {
        return paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    private String header, paragraph;

    public Article(String header, String paragraph) {
        this.header = header;
        this.paragraph = paragraph;
    }

    public Article(Article source){
        this.header = source.header;
        this.paragraph = source.paragraph;
    }

    public Article clone(){
        return new Article(this);
    }
}
