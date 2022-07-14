package com.example.designpatterns.structural.bridge;

public class WordParser implements DocumentParser {

    private String fileName;

    public WordParser(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String parse() {
        return "Content of Word document.";
    }
}
