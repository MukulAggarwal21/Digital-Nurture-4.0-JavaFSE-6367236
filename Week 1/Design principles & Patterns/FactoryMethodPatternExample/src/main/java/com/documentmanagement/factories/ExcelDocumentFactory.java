package com.documentmanagement.factories;

import com.documentmanagement.documents.Document;
import com.documentmanagement.documents.ExcelDocument;


public class ExcelDocumentFactory extends DocumentFactory {
    
    @Override
    public Document createDocument(String name) {
        System.out.println("ExcelDocumentFactory: Creating Excel document");
        return new ExcelDocument(name);
    }
}

