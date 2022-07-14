package com.example.designpatterns.structural.facade;

public class DocumentReader {
    public String read(String document) {
        if(document.endsWith(".docx")) {
            return new WordReader(document).getText();
        } else if (document.endsWith(".txt")){
            return new TextReader(document).getText();
        }

        return "";
    }
}
