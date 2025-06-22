package com.documentmanagement.factories;

import com.documentmanagement.documents.Document;
import com.documentmanagement.documents.WordDocument;


public class WordDocumentFactory extends DocumentFactory {
    
    @Override
    public Document createDocument(String name) {
        System.out.println("WordDocumentFactory: Creating Word document");
        return new WordDocument(name);
    }
}
