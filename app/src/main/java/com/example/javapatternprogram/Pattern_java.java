package com.example.javapatternprogram;

public class Pattern_java {

    String  nameOfPattern;

    String codingPattern;

    int patternImage;

    public Pattern_java(String nameOfPattern, String codingPattern, int patternImage) {
        this.nameOfPattern = nameOfPattern;
        this.codingPattern = codingPattern;
        this.patternImage = patternImage;
    }

    public String getNameOfPattern() {
        return nameOfPattern;
    }

    public void setNameOfPattern(String nameOfPattern) {
        this.nameOfPattern = nameOfPattern;
    }

    public String getCodingPattern() {
        return codingPattern;
    }

    public void setCodingPattern(String codingPattern) {
        this.codingPattern = codingPattern;
    }

    public int getPatternImage() {
        return patternImage;
    }

    public void setPatternImage(int patternImage) {
        this.patternImage = patternImage;
    }
}
