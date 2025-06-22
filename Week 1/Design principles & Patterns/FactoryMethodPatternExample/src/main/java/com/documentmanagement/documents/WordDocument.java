package com.documentmanagement.documents;


public class WordDocument extends Document {
    
    public WordDocument(String name) {
        super(name);
    }
    
    @Override
    public void create() {
        System.out.println("Creating Word document: " + name + ".docx");
        System.out.println("Setting up Word document formatting...");
    }
    
    @Override
    public void open() {
        System.out.println("Opening Word document: " + name + ".docx");
        System.out.println("Loading Word-specific features...");
    }
    
    @Override
    public void save() {
        System.out.println("Saving Word document: " + name + ".docx");
        System.out.println("Applying Word compression...");
    }
    
    @Override
    public void close() {
        System.out.println("Closing Word document: " + name + ".docx");
    }
    
    @Override
    public String getFileExtension() {
        return ".docx";
    }
    
    // Word-specific methods
    public void addTable() {
        System.out.println("Adding table to Word document");
    }
    
    public void insertImage() {
        System.out.println("Inserting image into Word document");
    }
}
