package com.documentmanagement;

import com.documentmanagement.documents.*;
import com.documentmanagement.factories.*;
import java.util.HashMap;
import java.util.Map;


public class DocumentManagementSystem {
    
    private Map<String, DocumentFactory> factoryRegistry;
    
    public DocumentManagementSystem() {
        initializeFactories();
    }
    
    private void initializeFactories() {
        factoryRegistry = new HashMap<>();
        factoryRegistry.put("WORD", new WordDocumentFactory());
        factoryRegistry.put("PDF", new PdfDocumentFactory());
        factoryRegistry.put("EXCEL", new ExcelDocumentFactory());
    }
    
    public Document createDocument(String type, String name) {
        DocumentFactory factory = factoryRegistry.get(type.toUpperCase());
        if (factory == null) {
            throw new IllegalArgumentException("Unsupported document type: " + type);
        }
        return factory.createDocument(name);
    }
    
    public Document processDocument(String type, String name, String content) {
        DocumentFactory factory = factoryRegistry.get(type.toUpperCase());
        if (factory == null) {
            throw new IllegalArgumentException("Unsupported document type: " + type);
        }
        return factory.processDocument(name, content);
    }
    
    public void listSupportedTypes() {
        System.out.println("Supported document types:");
        for (String type : factoryRegistry.keySet()) {
            System.out.println("- " + type);
        }
    }
}
