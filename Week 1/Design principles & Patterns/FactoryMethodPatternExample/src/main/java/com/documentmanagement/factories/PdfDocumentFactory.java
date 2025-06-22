package com.documentmanagement.factories;

import com.documentmanagement.documents.Document;
import com.documentmanagement.documents.PdfDocument;


public class PdfDocumentFactory extends DocumentFactory {
    
    @Override
    public Document createDocument(String name) {
        System.out.println("PdfDocumentFactory: Creating PDF document");
        return new PdfDocument(name);
    }
}
