package com.documentmanagement.factories;

import com.documentmanagement.documents.Document;


public abstract class DocumentFactory {
 
    public abstract Document createDocument(String name);
    
  
    public Document processDocument(String name, String content) {
        System.out.println("\n=== Processing Document ===");
        
        // Use the factory method to create the document
        Document doc = createDocument(name);
        
        // Common processing steps
        doc.create();
        doc.setContent(content);
        doc.save();
        
        System.out.println("Document processing completed!\n");
        return doc;
    }
}
