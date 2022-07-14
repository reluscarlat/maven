package com.example.designpatterns.structural.bridge;

public class DocumentReaderImpl implements DocumentReader {

    private DocumentParser documentParser;

    public DocumentReaderImpl(DocumentParser documentParser) {
        this.documentParser = documentParser;
    }

    @Override
    public String getText() {
        // TODO: here we would do more stuff if needed...
        return documentParser.parse();
    }
}
